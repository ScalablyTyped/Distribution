package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessTokenResponse extends StObject {
  
  /**
    * Temporary access token.
    */
  var AccessToken: js.UndefOr[TokenString] = js.undefined
}
object GetAccessTokenResponse {
  
  inline def apply(): GetAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessTokenResponse]
  }
  
  extension [Self <: GetAccessTokenResponse](x: Self) {
    
    inline def setAccessToken(value: TokenString): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
  }
}
