package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GCMChannelRequest extends StObject {
  
  /**
    * The Web API Key, also referred to as an API_KEY or server key, that you received from Google to communicate with Google services.
    */
  var ApiKey: string = js.native
  
  /**
    * Specifies whether to enable the GCM channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}
object GCMChannelRequest {
  
  @scala.inline
  def apply(ApiKey: string): GCMChannelRequest = {
    val __obj = js.Dynamic.literal(ApiKey = ApiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GCMChannelRequest]
  }
  
  @scala.inline
  implicit class GCMChannelRequestMutableBuilder[Self <: GCMChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: string): Self = StObject.set(x, "ApiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
