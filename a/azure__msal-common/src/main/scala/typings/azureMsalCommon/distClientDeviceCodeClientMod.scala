package typings.azureMsalCommon

import typings.azureMsalCommon.distClientBaseClientMod.BaseClient
import typings.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.distRequestCommonDeviceCodeRequestMod.CommonDeviceCodeRequest
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientDeviceCodeClientMod {
  
  @JSImport("@azure/msal-common/dist/client/DeviceCodeClient", "DeviceCodeClient")
  @js.native
  open class DeviceCodeClient protected () extends BaseClient {
    def this(configuration: ClientConfiguration) = this()
    
    /**
      * Gets device code from device code endpoint, calls back to with device code response, and
      * polls token endpoint to exchange device code for tokens
      * @param request
      */
    def acquireToken(request: CommonDeviceCodeRequest): js.Promise[AuthenticationResult | Null] = js.native
    
    /**
      * Creates token request with device code response and polls token endpoint at interval set by the device code
      * response
      * @param request
      * @param deviceCodeResponse
      */
    /* private */ var acquireTokenWithDeviceCode: Any = js.native
    
    /**
      * Breaks the polling with specific conditions.
      * @param request CommonDeviceCodeRequest
      * @param deviceCodeResponse DeviceCodeResponse
      */
    /* private */ var continuePolling: Any = js.native
    
    /**
      * Create device code endpoint query parameters and returns string
      */
    /* private */ var createQueryString: Any = js.native
    
    /**
      * Creates query parameters and converts to string.
      * @param request
      * @param deviceCodeResponse
      */
    /* private */ var createTokenRequestBody: Any = js.native
    
    /**
      * Executes POST request to device code endpoint
      * @param deviceCodeEndpoint
      * @param queryString
      * @param headers
      */
    /* private */ var executePostRequestToDeviceCodeEndpoint: Any = js.native
    
    /**
      * Creates device code request and executes http GET
      * @param request
      */
    /* private */ var getDeviceCode: Any = js.native
  }
}
