package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesRedirectPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/redirectPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/redirectPolicy", "DefaultRedirectOptions")
  @js.native
  val DefaultRedirectOptions: RedirectOptions = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/redirectPolicy", "RedirectPolicy")
  @js.native
  open class RedirectPolicy_ protected () extends BaseRequestPolicy {
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions) = this()
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions, maxRetries: Double) = this()
    
    val maxRetries: Double = js.native
  }
  
  inline def redirectPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def redirectPolicy(maximumRetries: Double): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectPolicy")(maximumRetries.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  
  trait RedirectOptions extends StObject {
    
    /**
      * When true, redirect responses are followed.  Defaults to true.
      */
    var handleRedirects: Boolean
    
    /**
      * The maximum number of times the redirect URL will be tried before
      * failing.  Defaults to 20.
      */
    var maxRetries: js.UndefOr[Double] = js.undefined
  }
  object RedirectOptions {
    
    inline def apply(handleRedirects: Boolean): RedirectOptions = {
      val __obj = js.Dynamic.literal(handleRedirects = handleRedirects.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedirectOptions] (val x: Self) extends AnyVal {
      
      inline def setHandleRedirects(value: Boolean): Self = StObject.set(x, "handleRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    }
  }
}
