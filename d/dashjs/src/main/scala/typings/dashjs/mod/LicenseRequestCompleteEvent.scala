package typings.dashjs.mod

import typings.dashjs.anon.MessageType
import typings.dashjs.dashjsStrings.public_licenseRequestComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseRequestCompleteEvent extends Event {
  
  var data: MessageType = js.native
  
  var error: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_LicenseRequestCompleteEvent: public_licenseRequestComplete = js.native
}
object LicenseRequestCompleteEvent {
  
  @scala.inline
  def apply(data: MessageType, `type`: public_licenseRequestComplete): LicenseRequestCompleteEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseRequestCompleteEvent]
  }
  
  @scala.inline
  implicit class LicenseRequestCompleteEventOps[Self <: LicenseRequestCompleteEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: MessageType): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: public_licenseRequestComplete): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
