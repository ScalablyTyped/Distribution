package typings.azureCoreHttp

import typings.azureCoreHttp.requestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.requestPolicyMod.RequestPolicy
import typings.azureCoreHttp.requestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.requestPolicyMod.RequestPolicyOptions
import typings.azureCoreHttp.serviceClientMod.ProxySettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyPolicyBrowserMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/proxyPolicy.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/proxyPolicy.browser", "ProxyPolicy")
  @js.native
  open class ProxyPolicy_ protected () extends BaseRequestPolicy {
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions) = this()
  }
  
  inline def getDefaultProxySettings(): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")().asInstanceOf[js.UndefOr[ProxySettings]]
  inline def getDefaultProxySettings(_proxyUrl: String): js.UndefOr[ProxySettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProxySettings")(_proxyUrl.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ProxySettings]]
  
  inline def proxyPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def proxyPolicy(_proxySettings: ProxySettings): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyPolicy")(_proxySettings.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
}
