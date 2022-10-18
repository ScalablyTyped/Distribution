package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesRpRegistrationPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/rpRegistrationPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/rpRegistrationPolicy", "RPRegistrationPolicy")
  @js.native
  open class RPRegistrationPolicy_ protected () extends BaseRequestPolicy {
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions) = this()
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions, _retryTimeout: Double) = this()
    
    val _retryTimeout: Double = js.native
  }
  
  inline def rpRegistrationPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("rpRegistrationPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def rpRegistrationPolicy(retryTimeout: Double): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("rpRegistrationPolicy")(retryTimeout.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
}
