package typings.azureCoreHttp

import typings.azureCoreAuth.mod.TokenCredential
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesBearerTokenAuthenticationPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/bearerTokenAuthenticationPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/bearerTokenAuthenticationPolicy", "DEFAULT_CYCLER_OPTIONS")
  @js.native
  val DEFAULT_CYCLER_OPTIONS: TokenCyclerOptions = js.native
  
  inline def bearerTokenAuthenticationPolicy(credential: TokenCredential, scopes: String): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("bearerTokenAuthenticationPolicy")(credential.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def bearerTokenAuthenticationPolicy(credential: TokenCredential, scopes: js.Array[String]): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("bearerTokenAuthenticationPolicy")(credential.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  
  trait TokenCyclerOptions extends StObject {
    
    /**
      * The window of time before token expiration during which the token will be
      * considered unusable due to risk of the token expiring before sending the
      * request.
      *
      * This will only become meaningful if the refresh fails for over
      * (refreshWindow - forcedRefreshWindow) milliseconds.
      */
    var forcedRefreshWindowInMs: Double
    
    /**
      * The window of time before token expiration during which
      * we will attempt to refresh the token.
      */
    var refreshWindowInMs: Double
    
    /**
      * Interval in milliseconds to retry failed token refreshes.
      */
    var retryIntervalInMs: Double
  }
  object TokenCyclerOptions {
    
    inline def apply(forcedRefreshWindowInMs: Double, refreshWindowInMs: Double, retryIntervalInMs: Double): TokenCyclerOptions = {
      val __obj = js.Dynamic.literal(forcedRefreshWindowInMs = forcedRefreshWindowInMs.asInstanceOf[js.Any], refreshWindowInMs = refreshWindowInMs.asInstanceOf[js.Any], retryIntervalInMs = retryIntervalInMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenCyclerOptions]
    }
    
    extension [Self <: TokenCyclerOptions](x: Self) {
      
      inline def setForcedRefreshWindowInMs(value: Double): Self = StObject.set(x, "forcedRefreshWindowInMs", value.asInstanceOf[js.Any])
      
      inline def setRefreshWindowInMs(value: Double): Self = StObject.set(x, "refreshWindowInMs", value.asInstanceOf[js.Any])
      
      inline def setRetryIntervalInMs(value: Double): Self = StObject.set(x, "retryIntervalInMs", value.asInstanceOf[js.Any])
    }
  }
}
