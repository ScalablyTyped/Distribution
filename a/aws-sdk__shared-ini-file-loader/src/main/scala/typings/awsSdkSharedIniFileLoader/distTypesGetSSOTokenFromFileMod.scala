package typings.awsSdkSharedIniFileLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetSSOTokenFromFileMod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/getSSOTokenFromFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSSOTokenFromFile(id: String): js.Promise[SSOToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSSOTokenFromFile")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SSOToken]]
  
  trait SSOToken extends StObject {
    
    /**
      * A base64 encoded string returned by the sso-oidc service.
      */
    var accessToken: String
    
    /**
      * The unique identifier string for each client. The client ID generated when performing the registration
      * portion of the OIDC authorization flow. This is used to refresh the accessToken.
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * A secret string generated when performing the registration portion of the OIDC authorization flow.
      * This is used to refresh the accessToken.
      */
    var clientSecret: js.UndefOr[String] = js.undefined
    
    /**
      * The expiration time of the accessToken as an RFC 3339 formatted timestamp.
      */
    var expiresAt: String
    
    /**
      * The token used to obtain an access token in the event that the accessToken is invalid or expired.
      */
    var refreshToken: js.UndefOr[String] = js.undefined
    
    /**
      * The configured sso_region for the profile that credentials are being resolved for.
      */
    var region: js.UndefOr[String] = js.undefined
    
    /**
      * The expiration time of the client registration (clientId and clientSecret) as an RFC 3339 formatted timestamp.
      */
    var registrationExpiresAt: js.UndefOr[String] = js.undefined
    
    /**
      * The configured sso_start_url for the profile that credentials are being resolved for.
      */
    var startUrl: js.UndefOr[String] = js.undefined
  }
  object SSOToken {
    
    inline def apply(accessToken: String, expiresAt: String): SSOToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSOToken]
    }
    
    extension [Self <: SSOToken](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRegistrationExpiresAt(value: String): Self = StObject.set(x, "registrationExpiresAt", value.asInstanceOf[js.Any])
      
      inline def setRegistrationExpiresAtUndefined: Self = StObject.set(x, "registrationExpiresAt", js.undefined)
      
      inline def setStartUrl(value: String): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
      
      inline def setStartUrlUndefined: Self = StObject.set(x, "startUrl", js.undefined)
    }
  }
}
