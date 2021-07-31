package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenTunnelResponse extends StObject {
  
  /**
    * The access token the destination local proxy uses to connect to AWS IoT Secure Tunneling.
    */
  var destinationAccessToken: js.UndefOr[ClientAccessToken] = js.undefined
  
  /**
    * The access token the source local proxy uses to connect to AWS IoT Secure Tunneling.
    */
  var sourceAccessToken: js.UndefOr[ClientAccessToken] = js.undefined
  
  /**
    * The Amazon Resource Name for the tunnel. The tunnel ARN format is arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt; 
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.undefined
  
  /**
    * A unique alpha-numeric tunnel ID.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.undefined
}
object OpenTunnelResponse {
  
  @scala.inline
  def apply(): OpenTunnelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTunnelResponse]
  }
  
  @scala.inline
  implicit class OpenTunnelResponseMutableBuilder[Self <: OpenTunnelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationAccessToken(value: ClientAccessToken): Self = StObject.set(x, "destinationAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationAccessTokenUndefined: Self = StObject.set(x, "destinationAccessToken", js.undefined)
    
    @scala.inline
    def setSourceAccessToken(value: ClientAccessToken): Self = StObject.set(x, "sourceAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccessTokenUndefined: Self = StObject.set(x, "sourceAccessToken", js.undefined)
    
    @scala.inline
    def setTunnelArn(value: TunnelArn): Self = StObject.set(x, "tunnelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelArnUndefined: Self = StObject.set(x, "tunnelArn", js.undefined)
    
    @scala.inline
    def setTunnelId(value: TunnelId): Self = StObject.set(x, "tunnelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelIdUndefined: Self = StObject.set(x, "tunnelId", js.undefined)
  }
}
