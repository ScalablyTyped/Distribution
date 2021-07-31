package typings.dashjs.mod

import typings.dashjs.anon.MessageType
import typings.dashjs.dashjsStrings.public_licenseRequestComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseRequestCompleteEvent
  extends StObject
     with Event {
  
  var data: MessageType
  
  var error: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_LicenseRequestCompleteEvent: public_licenseRequestComplete
}
object LicenseRequestCompleteEvent {
  
  @scala.inline
  def apply(data: MessageType): LicenseRequestCompleteEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("public_licenseRequestComplete")
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
