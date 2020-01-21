package typings.clipboard.mod

import typings.clipboard.clipboardStrings.error
import typings.clipboard.clipboardStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipboardJS extends js.Object {
  /**
    * Clears all event bindings.
    */
  def destroy(): Unit = js.native
  def on(`type`: String, handler: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_error(`type`: error, handler: js.Function1[/* e */ Event, Unit]): this.type = js.native
  /**
    * Subscribes to events that indicate the result of a copy/cut operation.
    * @param type Event type ('success' or 'error').
    * @param handler Callback function.
    */
  @JSName("on")
  def on_success(`type`: success, handler: js.Function1[/* e */ Event, Unit]): this.type = js.native
}

