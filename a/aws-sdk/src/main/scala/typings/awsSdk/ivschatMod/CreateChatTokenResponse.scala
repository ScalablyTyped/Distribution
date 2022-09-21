package typings.awsSdk.ivschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChatTokenResponse extends StObject {
  
  /**
    * Time after which an end user's session is no longer valid. This is an ISO 8601 timestamp; note that this is returned as a string.
    */
  var sessionExpirationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The issued client token, encrypted.
    */
  var token: js.UndefOr[ChatToken] = js.undefined
  
  /**
    * Time after which the token is no longer valid and cannot be used to connect to a room. This is an ISO 8601 timestamp; note that this is returned as a string.
    */
  var tokenExpirationTime: js.UndefOr[js.Date] = js.undefined
}
object CreateChatTokenResponse {
  
  inline def apply(): CreateChatTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChatTokenResponse]
  }
  
  extension [Self <: CreateChatTokenResponse](x: Self) {
    
    inline def setSessionExpirationTime(value: js.Date): Self = StObject.set(x, "sessionExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setSessionExpirationTimeUndefined: Self = StObject.set(x, "sessionExpirationTime", js.undefined)
    
    inline def setToken(value: ChatToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenExpirationTime(value: js.Date): Self = StObject.set(x, "tokenExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setTokenExpirationTimeUndefined: Self = StObject.set(x, "tokenExpirationTime", js.undefined)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
