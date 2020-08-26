package typings.cordovaPluginNativeKeyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeKeyboardHideOptions extends js.Object {
  /**
    * A boolean flag inidicating if the keyboard should be shown/hidden with an animation
    */
  var animated: js.UndefOr[Boolean] = js.native
}

object NativeKeyboardHideOptions {
  @scala.inline
  def apply(): NativeKeyboardHideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeKeyboardHideOptions]
  }
  @scala.inline
  implicit class NativeKeyboardHideOptionsOps[Self <: NativeKeyboardHideOptions] (val x: Self) extends AnyVal {
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
  }
  
}

