package typings
package debounceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("debounce", JSImport.Namespace)
@js.native
object debounceMod extends js.Object {
  val debounce: js.Function3[
    /* f */ js.Function, 
    /* interval */ js.UndefOr[scala.Double], 
    /* immediate */ js.UndefOr[scala.Boolean], 
    js.Function with debounceLib.Anon_Clear
  ] = js.native
  def apply[A /* <: js.Function */](f: A): A with debounceLib.Anon_Clear = js.native
  def apply[A /* <: js.Function */](f: A, interval: scala.Double): A with debounceLib.Anon_Clear = js.native
  def apply[A /* <: js.Function */](f: A, interval: scala.Double, immediate: scala.Boolean): A with debounceLib.Anon_Clear = js.native
}

