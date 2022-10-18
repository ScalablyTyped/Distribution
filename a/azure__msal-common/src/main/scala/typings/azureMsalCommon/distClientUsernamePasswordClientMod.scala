package typings.azureMsalCommon

import typings.azureMsalCommon.distClientBaseClientMod.BaseClient
import typings.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.distRequestCommonUsernamePasswordRequestMod.CommonUsernamePasswordRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientUsernamePasswordClientMod {
  
  @JSImport("@azure/msal-common/dist/client/UsernamePasswordClient", "UsernamePasswordClient")
  @js.native
  open class UsernamePasswordClient protected () extends BaseClient {
    def this(configuration: ClientConfiguration) = this()
    
    /**
      * API to acquire a token by passing the username and password to the service in exchage of credentials
      * password_grant
      * @param request
      */
    def acquireToken(request: CommonUsernamePasswordRequest): js.Promise[AuthenticationResult | Null] = js.native
    
    /**
      * Generates a map for all the params to be sent to the service
      * @param request
      */
    /* private */ var createTokenRequestBody: Any = js.native
    
    /**
      * Executes POST request to token endpoint
      * @param authority
      * @param request
      */
    /* private */ var executeTokenRequest: Any = js.native
  }
}
