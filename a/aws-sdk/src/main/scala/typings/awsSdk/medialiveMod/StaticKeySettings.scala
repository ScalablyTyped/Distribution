package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticKeySettings extends js.Object {
  /**
    * The URL of the license server used for protecting content.
    */
  var KeyProviderServer: js.UndefOr[InputLocation] = js.native
  /**
    * Static key value as a 32 character hexadecimal string.
    */
  var StaticKeyValue: stringMin32Max32 = js.native
}

object StaticKeySettings {
  @scala.inline
  def apply(StaticKeyValue: stringMin32Max32): StaticKeySettings = {
    val __obj = js.Dynamic.literal(StaticKeyValue = StaticKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticKeySettings]
  }
  @scala.inline
  implicit class StaticKeySettingsOps[Self <: StaticKeySettings] (val x: Self) extends AnyVal {
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
    def setStaticKeyValue(value: stringMin32Max32): Self = this.set("StaticKeyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyProviderServer(value: InputLocation): Self = this.set("KeyProviderServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyProviderServer: Self = this.set("KeyProviderServer", js.undefined)
  }
  
}

