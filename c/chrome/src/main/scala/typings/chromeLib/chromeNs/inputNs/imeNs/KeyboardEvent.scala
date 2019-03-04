package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent extends js.Object {
  /**
    * Optional.
    * Whether or not the ALT key is pressed.
    */
  var altKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * Whether or not the CAPS_LOCK is enabled.
    * @since Chrome 29.
    */
  var capsLock: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * Value of the physical key being pressed. The value is not affected by current keyboard layout or modifier state.
    * @since Chrome 26.
    */
  var code: java.lang.String
  /**
    * Optional.
    * Whether or not the CTRL key is pressed.
    */
  var ctrlKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * The extension ID of the sender of this keyevent.
    * @since Chrome 34.
    */
  var extensionId: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the key being pressed */
  var key: java.lang.String
  /**
    * Optional.
    * The deprecated HTML keyCode, which is system- and implementation-dependent numerical code signifying the unmodified identifier associated with the key pressed.
    * @since Chrome 37.
    */
  var keyCode: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the request. */
  var requestId: java.lang.String
  /**
    * Optional.
    * Whether or not the SHIFT key is pressed.
    */
  var shiftKey: js.UndefOr[scala.Boolean] = js.undefined
  /** One of keyup or keydown. */
  var `type`: java.lang.String
}

object KeyboardEvent {
  @scala.inline
  def apply(
    code: java.lang.String,
    key: java.lang.String,
    requestId: java.lang.String,
    `type`: java.lang.String,
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    capsLock: js.UndefOr[scala.Boolean] = js.undefined,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    extensionId: java.lang.String = null,
    keyCode: scala.Int | scala.Double = null,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined
  ): KeyboardEvent = {
    val __obj = js.Dynamic.literal(code = code, key = key, requestId = requestId)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(capsLock)) __obj.updateDynamic("capsLock")(capsLock)
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (extensionId != null) __obj.updateDynamic("extensionId")(extensionId)
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    __obj.asInstanceOf[KeyboardEvent]
  }
}

