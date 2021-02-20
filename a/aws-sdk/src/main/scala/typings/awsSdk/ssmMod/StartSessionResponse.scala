package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSessionResponse extends StObject {
  
  /**
    * The ID of the session.
    */
  var SessionId: js.UndefOr[typings.awsSdk.ssmMod.SessionId] = js.native
  
  /**
    * A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: wss://ssmmessages.region.amazonaws.com/v1/data-channel/session-id?stream=(input|output)   region represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as us-east-2 for the US East (Ohio) Region. For a list of supported region values, see the Region column in Systems Manager service endpoints in the AWS General Reference.  session-id represents the ID of a Session Manager session, such as 1a2b3c4dEXAMPLE.
    */
  var StreamUrl: js.UndefOr[typings.awsSdk.ssmMod.StreamUrl] = js.native
  
  /**
    * An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.
    */
  var TokenValue: js.UndefOr[typings.awsSdk.ssmMod.TokenValue] = js.native
}
object StartSessionResponse {
  
  @scala.inline
  def apply(): StartSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSessionResponse]
  }
  
  @scala.inline
  implicit class StartSessionResponseMutableBuilder[Self <: StartSessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    @scala.inline
    def setStreamUrl(value: StreamUrl): Self = StObject.set(x, "StreamUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUrlUndefined: Self = StObject.set(x, "StreamUrl", js.undefined)
    
    @scala.inline
    def setTokenValue(value: TokenValue): Self = StObject.set(x, "TokenValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenValueUndefined: Self = StObject.set(x, "TokenValue", js.undefined)
  }
}
