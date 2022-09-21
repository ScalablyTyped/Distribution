package typings.azureCoreHttp

import typings.azureCoreHttp.requestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.requestPolicyMod.RequestPolicy
import typings.azureCoreHttp.requestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.requestPolicyMod.RequestPolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keepAlivePolicyMod {
  
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
    
    extension [Self <: KeepAliveOptions](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    }
  }
}
