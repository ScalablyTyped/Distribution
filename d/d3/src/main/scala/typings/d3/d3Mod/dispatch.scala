package typings.d3.d3Mod

import typings.d3DashDispatch.d3DashDispatchMod.Dispatch
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "dispatch")
@js.native
object dispatch extends js.Object {
  def apply[T /* <: EventTarget */](types: String*): Dispatch[T] = js.native
}

