package typings
package debounceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Debounce extends js.Object {
  def apply[A /* <: js.Function */](f: A): Anon_Clear with A = js.native
  def apply[A /* <: js.Function */](f: A, interval: scala.Double): Anon_Clear with A = js.native
  def apply[A /* <: js.Function */](f: A, interval: scala.Double, immediate: scala.Boolean): Anon_Clear with A = js.native
}

