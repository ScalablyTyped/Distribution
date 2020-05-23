package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent extends js.Object {
  /**
    * Optional.
    * Whether or not the ALT key is pressed.
    */
  var altKey: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * Whether or not the ALTGR key is pressed.
    * @since Chrome 79.
    */
  var altgrKey: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * Whether or not the CAPS_LOCK is enabled.
    * @since Chrome 29.
    */
  var capsLock: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * Value of the physical key being pressed. The value is not affected by current keyboard layout or modifier state.
    * @since Chrome 26.
    */
  var code: String
  /**
    * Optional.
    * Whether or not the CTRL key is pressed.
    */
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * The extension ID of the sender of this keyevent.
    * @since Chrome 34.
    */
  var extensionId: js.UndefOr[String] = js.undefined
  /** Value of the key being pressed */
  var key: String
  /**
    * Optional.
    * The deprecated HTML keyCode, which is system- and implementation-dependent numerical code signifying the unmodified identifier associated with the key pressed.
    * @since Chrome 37.
    */
  var keyCode: js.UndefOr[Double] = js.undefined
  /**
    * Optional.
    * The ID of the request.
    * @deprecated since Chrome 79.
    */
  var requestId: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * Whether or not the SHIFT key is pressed.
    */
  var shiftKey: js.UndefOr[Boolean] = js.undefined
  /** One of keyup or keydown. */
  var `type`: String
}

object KeyboardEvent {
  @scala.inline
  def apply(
    code: String,
    key: String,
    `type`: String,
    altKey: js.UndefOr[Boolean] = js.undefined,
    altgrKey: js.UndefOr[Boolean] = js.undefined,
    capsLock: js.UndefOr[Boolean] = js.undefined,
    ctrlKey: js.UndefOr[Boolean] = js.undefined,
    extensionId: String = null,
    keyCode: js.UndefOr[Double] = js.undefined,
    requestId: String = null,
    shiftKey: js.UndefOr[Boolean] = js.undefined
  ): KeyboardEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(altgrKey)) __obj.updateDynamic("altgrKey")(altgrKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(capsLock)) __obj.updateDynamic("capsLock")(capsLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey.get.asInstanceOf[js.Any])
    if (extensionId != null) __obj.updateDynamic("extensionId")(extensionId.asInstanceOf[js.Any])
    if (!js.isUndefined(keyCode)) __obj.updateDynamic("keyCode")(keyCode.get.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
}

