package typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod

import typings.azureCoreAuth.mod.AccessToken
import typings.azureCoreAuth.mod.GetTokenOptions
import typings.azureLogger.mod.AzureLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeRequestOnChallengeOptions extends StObject {
  
  /**
    * Function that retrieves either a cached access token or a new access token.
    */
  def getAccessToken(scopes: js.Array[String], options: GetTokenOptions): js.Promise[AccessToken | Null]
  
  /**
    * A logger, if one was sent through the HTTP pipeline.
    */
  var logger: js.UndefOr[AzureLogger] = js.undefined
  
  /**
    * Request that the policy is trying to fulfill.
    */
  var request: PipelineRequest
  
  /**
    * Response containing the challenge.
    */
  var response: PipelineResponse
  
  /**
    * The scopes for which the bearer token applies.
    */
  var scopes: js.Array[String]
}
object AuthorizeRequestOnChallengeOptions {
  
  inline def apply(
    getAccessToken: (js.Array[String], GetTokenOptions) => js.Promise[AccessToken | Null],
    request: PipelineRequest,
    response: PipelineResponse,
    scopes: js.Array[String]
  ): AuthorizeRequestOnChallengeOptions = {
    val __obj = js.Dynamic.literal(getAccessToken = js.Any.fromFunction2(getAccessToken), request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeRequestOnChallengeOptions]
  }
  
  extension [Self <: AuthorizeRequestOnChallengeOptions](x: Self) {
    
    inline def setGetAccessToken(value: (js.Array[String], GetTokenOptions) => js.Promise[AccessToken | Null]): Self = StObject.set(x, "getAccessToken", js.Any.fromFunction2(value))
    
    inline def setLogger(value: AzureLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setRequest(value: PipelineRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: PipelineResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
