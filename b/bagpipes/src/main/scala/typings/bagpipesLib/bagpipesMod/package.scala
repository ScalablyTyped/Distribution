package typings
package bagpipesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bagpipesMod {
  type Affinity = bagpipesLib.bagpipesLibStrings.hoist | bagpipesLib.bagpipesLibStrings.sink
  type Fitting = js.Function2[/* context */ FittingContext, /* next */ bagpipesLib.Anon_Err, scala.Unit]
  type FittingFactory = js.Function2[/* fittingDef */ FittingDef, /* bagpipes */ js.Any, Fitting]
  type FittingType = bagpipesLib.bagpipesLibStrings.system | bagpipesLib.bagpipesLibStrings.user | java.lang.String
  type PipeDef = js.Array[js.Any] | java.lang.String | FittingDef
}
