package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMSChannelRequest extends StObject {
  
  /**
    * Specifies whether to enable the SMS channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  
  /**
    * The identity that you want to display on recipients' devices when they receive messages from the SMS channel.
    */
  var SenderId: js.UndefOr[string] = js.native
  
  /**
    * The registered short code that you want to use when you send messages through the SMS channel.
    */
  var ShortCode: js.UndefOr[string] = js.native
}
object SMSChannelRequest {
  
  @scala.inline
  def apply(): SMSChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSChannelRequest]
  }
  
  @scala.inline
  implicit class SMSChannelRequestMutableBuilder[Self <: SMSChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setSenderId(value: string): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
    
    @scala.inline
    def setShortCode(value: string): Self = StObject.set(x, "ShortCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortCodeUndefined: Self = StObject.set(x, "ShortCode", js.undefined)
  }
}
