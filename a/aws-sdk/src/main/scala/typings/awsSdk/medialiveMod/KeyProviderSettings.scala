package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyProviderSettings extends js.Object {
  var StaticKeySettings: js.UndefOr[typings.awsSdk.medialiveMod.StaticKeySettings] = js.native
}

object KeyProviderSettings {
  @scala.inline
  def apply(): KeyProviderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyProviderSettings]
  }
  @scala.inline
  implicit class KeyProviderSettingsOps[Self <: KeyProviderSettings] (val x: Self) extends AnyVal {
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
    def setStaticKeySettings(value: StaticKeySettings): Self = this.set("StaticKeySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticKeySettings: Self = this.set("StaticKeySettings", js.undefined)
  }
  
}

