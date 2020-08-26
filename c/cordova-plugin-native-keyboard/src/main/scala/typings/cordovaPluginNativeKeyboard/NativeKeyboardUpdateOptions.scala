package typings.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeKeyboardUpdateOptions extends js.Object {
  /**
    * Position the cursor anywhere in the text range. Defaults to the end of the text.
    */
  var caretIndex: js.UndefOr[Double] = js.native
  /**
    * If false or omitted no changes to the keyboard state are made.
    */
  var showKeyboard: js.UndefOr[Boolean] = js.native
  /**
    * Replace the messenger's text by this. The current text remains if omitted.
    */
  var text: js.UndefOr[String] = js.native
}

object NativeKeyboardUpdateOptions {
  @scala.inline
  def apply(): NativeKeyboardUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeKeyboardUpdateOptions]
  }
  @scala.inline
  implicit class NativeKeyboardUpdateOptionsOps[Self <: NativeKeyboardUpdateOptions] (val x: Self) extends AnyVal {
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
    def setCaretIndex(value: Double): Self = this.set("caretIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaretIndex: Self = this.set("caretIndex", js.undefined)
    @scala.inline
    def setShowKeyboard(value: Boolean): Self = this.set("showKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowKeyboard: Self = this.set("showKeyboard", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

