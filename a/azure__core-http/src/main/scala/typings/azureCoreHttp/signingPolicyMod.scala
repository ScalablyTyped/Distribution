package typings.azureCoreHttp

import typings.azureCoreHttp.requestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.requestPolicyMod.RequestPolicy
import typings.azureCoreHttp.requestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.requestPolicyMod.RequestPolicyOptions
import typings.azureCoreHttp.serviceClientCredentialsMod.ServiceClientCredentials
import typings.azureCoreHttp.webResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signingPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/signingPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/signingPolicy", "SigningPolicy")
  @js.native
  open class SigningPolicy_ protected () extends BaseRequestPolicy {
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      authenticationProvider: ServiceClientCredentials
    ) = this()
    
    var authenticationProvider: ServiceClientCredentials = js.native
    
    def signRequest(request: WebResourceLike): js.Promise[WebResourceLike] = js.native
  }
  
  inline def signingPolicy(authenticationProvider: ServiceClientCredentials): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("signingPolicy")(authenticationProvider.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
}
