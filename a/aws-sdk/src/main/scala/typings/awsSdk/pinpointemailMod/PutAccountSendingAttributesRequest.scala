package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAccountSendingAttributesRequest extends StObject {
  
  /**
    * Enables or disables your account's ability to send email. Set to true to enable email sending, or set to false to disable email sending.  If AWS paused your account's ability to send email, you can't use this operation to resume your account's ability to send email. 
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
}
object PutAccountSendingAttributesRequest {
  
  @scala.inline
  def apply(): PutAccountSendingAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAccountSendingAttributesRequest]
  }
  
  @scala.inline
  implicit class PutAccountSendingAttributesRequestMutableBuilder[Self <: PutAccountSendingAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendingEnabled(value: Enabled): Self = StObject.set(x, "SendingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendingEnabledUndefined: Self = StObject.set(x, "SendingEnabled", js.undefined)
  }
}
