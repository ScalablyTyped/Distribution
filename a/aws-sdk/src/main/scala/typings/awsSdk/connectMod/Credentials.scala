package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  /**
    * An access token generated for a federated user to access Amazon Connect.
    */
  var AccessToken: js.UndefOr[SecurityToken] = js.undefined
  
  /**
    * A token generated with an expiration time for the session a user is logged in to Amazon Connect.
    */
  var AccessTokenExpiration: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Renews a token generated for a user to access the Amazon Connect instance.
    */
  var RefreshToken: js.UndefOr[SecurityToken] = js.undefined
  
  /**
    * Renews the expiration timer for a generated token.
    */
  var RefreshTokenExpiration: js.UndefOr[js.Date] = js.undefined
}
object Credentials {
  
  inline def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  extension [Self <: Credentials](x: Self) {
    
    inline def setAccessToken(value: SecurityToken): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenExpiration(value: js.Date): Self = StObject.set(x, "AccessTokenExpiration", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenExpirationUndefined: Self = StObject.set(x, "AccessTokenExpiration", js.undefined)
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    inline def setRefreshToken(value: SecurityToken): Self = StObject.set(x, "RefreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenExpiration(value: js.Date): Self = StObject.set(x, "RefreshTokenExpiration", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenExpirationUndefined: Self = StObject.set(x, "RefreshTokenExpiration", js.undefined)
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "RefreshToken", js.undefined)
  }
}
