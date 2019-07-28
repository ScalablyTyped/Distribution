package typings.debounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("debounce", JSImport.Namespace)
@js.native
object debounceMod extends js.Object {
  def apply[A /* <: js.Function */](f: A): Anon_Clear with A = js.native
  def apply[A /* <: js.Function */](f: A, interval: Double): Anon_Clear with A = js.native
  def apply[A /* <: js.Function */](f: A, interval: Double, immediate: Boolean): Anon_Clear with A = js.native
  @js.native
  object debounce extends js.Object {
    def apply[A /* <: js.Function */](f: A): Anon_Clear with A = js.native
    def apply[A /* <: js.Function */](f: A, interval: Double): Anon_Clear with A = js.native
    def apply[A /* <: js.Function */](f: A, interval: Double, immediate: Boolean): Anon_Clear with A = js.native
  }
  
}

