package typings.bagpipes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bagpipesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type Fitting = js.Function2[
    /* context */ FittingContext, 
    /* next */ js.Function2[/* err */ js.UndefOr[Error | Null], /* res */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
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
