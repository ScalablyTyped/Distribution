package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesKeepAlivePolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/keepAlivePolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/keepAlivePolicy", "DefaultKeepAliveOptions")
  @js.native
  val DefaultKeepAliveOptions: KeepAliveOptions = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/keepAlivePolicy", "KeepAlivePolicy")
  @js.native
  open class KeepAlivePolicy_ protected () extends BaseRequestPolicy {
    /**
      * Creates an instance of KeepAlivePolicy.
      *
      * @param nextPolicy -
      * @param options -
      * @param keepAliveOptions -
      */
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions, keepAliveOptions: KeepAliveOptions) = this()
    
    /* private */ val keepAliveOptions: Any = js.native
  }
  
  inline def keepAlivePolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("keepAlivePolicy")().asInstanceOf[RequestPolicyFactory]
  inline def keepAlivePolicy(keepAliveOptions: KeepAliveOptions): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("keepAlivePolicy")(keepAliveOptions.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  
  trait KeepAliveOptions extends StObject {
    
    /**
      * When true, connections will be kept alive for multiple requests.
      * Defaults to true.
      */
    var enable: Boolean
  }
  object KeepAliveOptions {
    
    inline def apply(enable: Boolean): KeepAliveOptions = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeepAliveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeepAliveOptions] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    }
  }
}
