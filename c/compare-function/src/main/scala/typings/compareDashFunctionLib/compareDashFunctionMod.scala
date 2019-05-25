package typings
package compareDashFunctionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("compare-function", JSImport.Namespace)
@js.native
object compareDashFunctionMod extends js.Object {
  def apply[T](fn: js.Function1[/* item */ T, _]): js.Function2[
    /* a */ T, 
    /* b */ T, 
    compareDashFunctionLib.compareDashFunctionLibNumbers.`-1` | compareDashFunctionLib.compareDashFunctionLibNumbers.`0` | compareDashFunctionLib.compareDashFunctionLibNumbers.`1`
  ] = js.native
  def apply[T](sign: scala.Double, fn: js.Function1[/* item */ T, _]): js.Function2[
    /* a */ T, 
    /* b */ T, 
    compareDashFunctionLib.compareDashFunctionLibNumbers.`-1` | compareDashFunctionLib.compareDashFunctionLibNumbers.`0` | compareDashFunctionLib.compareDashFunctionLibNumbers.`1`
  ] = js.native
}

