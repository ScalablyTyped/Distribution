package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADMChannelRequest extends StObject {
  
  /**
    * The Client ID that you received from Amazon to send messages by using ADM.
    */
  var ClientId: string = js.native
  
  /**
    * The Client Secret that you received from Amazon to send messages by using ADM.
    */
  var ClientSecret: string = js.native
  
  /**
    * Specifies whether to enable the ADM channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}
object ADMChannelRequest {
  
  @scala.inline
  def apply(ClientId: string, ClientSecret: string): ADMChannelRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], ClientSecret = ClientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADMChannelRequest]
  }
  
  @scala.inline
  implicit class ADMChannelRequestMutableBuilder[Self <: ADMChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: string): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: string): Self = StObject.set(x, "ClientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
