package typings.bagpipes

import org.scalablytyped.runtime.StringDictionary
import typings.bagpipes.Fn_Err
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bagpipesMod {
  type Fitting = js.Function2[/* context */ FittingContext, /* next */ Fn_Err, Unit]
  type FittingFactory = js.Function2[/* fittingDef */ FittingDef, /* bagpipes */ js.Any, Fitting]
  /* Rewritten from type alias, can be one of: 
    - typings.bagpipes.bagpipesStrings.system
    - typings.bagpipes.bagpipesStrings.user
    - java.lang.String
  */
  type FittingType = _FittingType | String
  type FittingTypesMap = StringDictionary[FittingFactory]
  type PipeDef = js.Array[js.Any] | String | FittingDef
  type PipeDefMap = StringDictionary[PipeDef]
}
