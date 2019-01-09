package typings
package debounceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("debounce", JSImport.Namespace)
@js.native
object debounceMod extends js.Object {
  val debounce: debounceLib.Anon_Debounce = js.native
  def apply[A /* <: js.Function */](f: A): debounceLib.Anon_Clear with A = js.native
  def apply[A /* <: js.Function */](f: A, interval: scala.Double): debounceLib.Anon_Clear with A = js.native
  def apply[A /* <: js.Function */](f: A, interval: scala.Double, immediate: scala.Boolean): debounceLib.Anon_Clear with A = js.native
}

