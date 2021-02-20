package typings.dashjs.mod

import typings.dashjs.anon.MessageType
import typings.dashjs.dashjsStrings.public_licenseRequestComplete
import org.scalablytyped.runtime.StObject
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
  implicit class LicenseRequestCompleteEventMutableBuilder[Self <: LicenseRequestCompleteEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: MessageType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setType(value: public_licenseRequestComplete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
