package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardEvent extends js.Object {
  /**
    * Optional.
    * Whether or not the ALT key is pressed.
    */
  var altKey: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * Whether or not the ALTGR key is pressed.
    * @since Chrome 79.
    */
  var altgrKey: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * Whether or not the CAPS_LOCK is enabled.
    * @since Chrome 29.
    */
  var capsLock: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * Value of the physical key being pressed. The value is not affected by current keyboard layout or modifier state.
    * @since Chrome 26.
    */
  var code: String = js.native
  /**
    * Optional.
    * Whether or not the CTRL key is pressed.
    */
  var ctrlKey: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * The extension ID of the sender of this keyevent.
    * @since Chrome 34.
    */
  var extensionId: js.UndefOr[String] = js.native
  /** Value of the key being pressed */
  var key: String = js.native
  /**
    * Optional.
    * The deprecated HTML keyCode, which is system- and implementation-dependent numerical code signifying the unmodified identifier associated with the key pressed.
    * @since Chrome 37.
    */
  var keyCode: js.UndefOr[Double] = js.native
  /**
    * Optional.
    * The ID of the request.
    * @deprecated since Chrome 79.
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * Optional.
    * Whether or not the SHIFT key is pressed.
    */
  var shiftKey: js.UndefOr[Boolean] = js.native
  /** One of keyup or keydown. */
  var `type`: String = js.native
}

object KeyboardEvent {
  @scala.inline
  def apply(code: String, key: String, `type`: String): KeyboardEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  @scala.inline
  implicit class KeyboardEventOps[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltKey: Self = this.set("altKey", js.undefined)
    @scala.inline
    def setAltgrKey(value: Boolean): Self = this.set("altgrKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltgrKey: Self = this.set("altgrKey", js.undefined)
    @scala.inline
    def setCapsLock(value: Boolean): Self = this.set("capsLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapsLock: Self = this.set("capsLock", js.undefined)
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtrlKey: Self = this.set("ctrlKey", js.undefined)
    @scala.inline
    def setExtensionId(value: String): Self = this.set("extensionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionId: Self = this.set("extensionId", js.undefined)
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyCode: Self = this.set("keyCode", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
  }
  
}

