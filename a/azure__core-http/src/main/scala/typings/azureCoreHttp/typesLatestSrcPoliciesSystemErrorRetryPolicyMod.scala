package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesSystemErrorRetryPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/systemErrorRetryPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/systemErrorRetryPolicy", "SystemErrorRetryPolicy")
  @js.native
  open class SystemErrorRetryPolicy_ protected () extends BaseRequestPolicy {
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions) = this()
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions, retryCount: Double) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Double,
      retryInterval: Double
    ) = this()
    def this(nextPolicy: RequestPolicy, options: RequestPolicyOptions, retryCount: Unit, retryInterval: Double) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Double,
      retryInterval: Double,
      minRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Double,
      retryInterval: Unit,
      minRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Unit,
      retryInterval: Double,
      minRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Unit,
      retryInterval: Unit,
      minRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Double,
      retryInterval: Double,
      minRetryInterval: Double,
      maxRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Double,
      retryInterval: Double,
      minRetryInterval: Unit,
      maxRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Double,
      retryInterval: Unit,
      minRetryInterval: Double,
      maxRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Double,
      retryInterval: Unit,
      minRetryInterval: Unit,
      maxRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Unit,
      retryInterval: Double,
      minRetryInterval: Double,
      maxRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Unit,
      retryInterval: Double,
      minRetryInterval: Unit,
      maxRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Unit,
      retryInterval: Unit,
      minRetryInterval: Double,
      maxRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Unit,
      retryInterval: Unit,
      minRetryInterval: Unit,
      maxRetryInterval: Double
    ) = this()
    
    var maxRetryInterval: Double = js.native
    
    var minRetryInterval: Double = js.native
    
    var retryCount: Double = js.native
    
    var retryInterval: Double = js.native
  }
  
  inline def systemErrorRetryPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Double, minRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Double, minRetryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Double, minRetryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Unit, minRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Unit, minRetryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Double, retryInterval: Unit, minRetryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Double, minRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Double, minRetryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Double, minRetryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Unit, minRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Unit, minRetryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def systemErrorRetryPolicy(retryCount: Unit, retryInterval: Unit, minRetryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("systemErrorRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], minRetryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
}
