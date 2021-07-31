package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthorizationTokenResult extends StObject {
  
  /**
    *  The returned authentication token. 
    */
  var authorizationToken: js.UndefOr[String] = js.undefined
  
  /**
    *  A timestamp that specifies the date and time the authorization token expires. 
    */
  var expiration: js.UndefOr[Timestamp] = js.undefined
}
object GetAuthorizationTokenResult {
  
  @scala.inline
  def apply(): GetAuthorizationTokenResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizationTokenResult]
  }
  
  @scala.inline
  implicit class GetAuthorizationTokenResultMutableBuilder[Self <: GetAuthorizationTokenResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationToken(value: String): Self = StObject.set(x, "authorizationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationTokenUndefined: Self = StObject.set(x, "authorizationToken", js.undefined)
    
    @scala.inline
    def setExpiration(value: Timestamp): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
  }
}
