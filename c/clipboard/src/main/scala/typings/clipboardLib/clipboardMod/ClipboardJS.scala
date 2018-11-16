package typings
package clipboardLib.clipboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipboardJS extends js.Object {
  /**
       * Clears all event bindings.
       */
  def destroy(): scala.Unit = js.native
  def on(`type`: java.lang.String, handler: js.Function1[/* repeated */js.Any, scala.Unit]): this.type = js.native
  /**
       * Subscribes to events that indicate the result of a copy/cut operation.
       * @param type Event type ('success' or 'error').
       * @param handler Callback function.
       */
  @JSName("on")
  def on_error(
    `type`: clipboardLib.clipboardLibStrings.error,
    handler: js.Function1[/* e */ clipboardLib.clipboardMod.ClipboardJSNs.Event, scala.Unit]
  ): this.type = js.native
  /**
       * Subscribes to events that indicate the result of a copy/cut operation.
       * @param type Event type ('success' or 'error').
       * @param handler Callback function.
       */
  @JSName("on")
  def on_success(
    `type`: clipboardLib.clipboardLibStrings.success,
    handler: js.Function1[/* e */ clipboardLib.clipboardMod.ClipboardJSNs.Event, scala.Unit]
  ): this.type = js.native
}

