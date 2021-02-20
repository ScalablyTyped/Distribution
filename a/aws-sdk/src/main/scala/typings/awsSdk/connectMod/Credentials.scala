package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials extends StObject {
  
  /**
    * An access token generated for a federated user to access Amazon Connect.
    */
  var AccessToken: js.UndefOr[SecurityToken] = js.native
  
  /**
    * A token generated with an expiration time for the session a user is logged in to Amazon Connect.
    */
  var AccessTokenExpiration: js.UndefOr[timestamp] = js.native
  
  /**
    * Renews a token generated for a user to access the Amazon Connect instance.
    */
  var RefreshToken: js.UndefOr[SecurityToken] = js.native
  
  /**
    * Renews the expiration timer for a generated token.
    */
  var RefreshTokenExpiration: js.UndefOr[timestamp] = js.native
}
object Credentials {
  
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: SecurityToken): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenExpiration(value: timestamp): Self = StObject.set(x, "AccessTokenExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenExpirationUndefined: Self = StObject.set(x, "AccessTokenExpiration", js.undefined)
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: SecurityToken): Self = StObject.set(x, "RefreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenExpiration(value: timestamp): Self = StObject.set(x, "RefreshTokenExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenExpirationUndefined: Self = StObject.set(x, "RefreshTokenExpiration", js.undefined)
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "RefreshToken", js.undefined)
  }
}
