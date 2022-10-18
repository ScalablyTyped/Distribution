package typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod

import typings.azureCoreAuth.mod.TokenCredential
import typings.azureLogger.mod.AzureLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BearerTokenAuthenticationPolicyOptions extends StObject {
  
  /**
    * Allows for the processing of [Continuous Access Evaluation](https://docs.microsoft.com/azure/active-directory/conditional-access/concept-continuous-access-evaluation) challenges.
    * If provided, it must contain at least the `authorizeRequestOnChallenge` method.
    * If provided, after a request is sent, if it has a challenge, it can be processed to re-send the original request with the relevant challenge information.
    */
  var challengeCallbacks: js.UndefOr[ChallengeCallbacks] = js.undefined
  
  /**
    * The TokenCredential implementation that can supply the bearer token.
    */
  var credential: js.UndefOr[TokenCredential] = js.undefined
  
  /**
    * A logger can be sent for debugging purposes.
    */
  var logger: js.UndefOr[AzureLogger] = js.undefined
  
  /**
    * The scopes for which the bearer token applies.
    */
  var scopes: String | js.Array[String]
}
object BearerTokenAuthenticationPolicyOptions {
  
  inline def apply(scopes: String | js.Array[String]): BearerTokenAuthenticationPolicyOptions = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BearerTokenAuthenticationPolicyOptions]
  }
  
  extension [Self <: BearerTokenAuthenticationPolicyOptions](x: Self) {
    
    inline def setChallengeCallbacks(value: ChallengeCallbacks): Self = StObject.set(x, "challengeCallbacks", value.asInstanceOf[js.Any])
    
    inline def setChallengeCallbacksUndefined: Self = StObject.set(x, "challengeCallbacks", js.undefined)
    
    inline def setCredential(value: TokenCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setLogger(value: AzureLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setScopes(value: String | js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
