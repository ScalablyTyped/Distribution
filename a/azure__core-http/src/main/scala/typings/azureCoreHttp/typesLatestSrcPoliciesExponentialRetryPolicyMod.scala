package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesExponentialRetryPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/exponentialRetryPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/exponentialRetryPolicy", "DefaultRetryOptions")
  @js.native
  val DefaultRetryOptions: RetryOptions = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/exponentialRetryPolicy", "ExponentialRetryPolicy")
  @js.native
  open class ExponentialRetryPolicy_ protected () extends BaseRequestPolicy {
    /**
      * @param nextPolicy - The next RequestPolicy in the pipeline chain.
      * @param options - The options for this RequestPolicy.
      * @param retryCount - The client retry count.
      * @param retryInterval - The client retry interval, in milliseconds.
      * @param minRetryInterval - The minimum retry interval, in milliseconds.
      * @param maxRetryInterval - The maximum retry interval, in milliseconds.
      */
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
      maxRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Double,
      retryInterval: Unit,
      maxRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Unit,
      retryInterval: Double,
      maxRetryInterval: Double
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      options: RequestPolicyOptions,
      retryCount: Unit,
      retryInterval: Unit,
      maxRetryInterval: Double
    ) = this()
    
    /**
      * The maximum retry interval in milliseconds.
      */
    var maxRetryInterval: Double = js.native
    
    /**
      * The client retry count.
      */
    var retryCount: Double = js.native
    
    /**
      * The client retry interval in milliseconds.
      */
    var retryInterval: Double = js.native
  }
  
  @js.native
  sealed trait RetryMode extends StObject
  @JSImport("@azure/core-http/types/latest/src/policies/exponentialRetryPolicy", "RetryMode")
  @js.native
  object RetryMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RetryMode & Double] = js.native
    
    /**
      * Currently supported retry mode.
      * Each time a retry happens, it will take exponentially more time than the last time.
      */
    @js.native
    sealed trait Exponential
      extends StObject
         with RetryMode
    /* 0 */ val Exponential: typings.azureCoreHttp.typesLatestSrcPoliciesExponentialRetryPolicyMod.RetryMode.Exponential & Double = js.native
  }
  
  inline def exponentialRetryPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Double): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Double, retryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Double, retryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Double, retryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Unit, retryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Unit, retryInterval: Double, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def exponentialRetryPolicy(retryCount: Unit, retryInterval: Unit, maxRetryInterval: Double): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("exponentialRetryPolicy")(retryCount.asInstanceOf[js.Any], retryInterval.asInstanceOf[js.Any], maxRetryInterval.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  
  trait RetryOptions extends StObject {
    
    /**
      * The maximum number of retry attempts.  Defaults to 3.
      */
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum delay in milliseconds allowed before retrying an operation. Defaults
      * to 90000 (90 seconds).
      */
    var maxRetryDelayInMs: js.UndefOr[Double] = js.undefined
    
    /**
      * Currently supporting only Exponential mode.
      */
    var mode: js.UndefOr[RetryMode] = js.undefined
    
    /**
      * The amount of delay in milliseconds between retry attempts. Defaults to 30000
      * (30 seconds). The delay increases exponentially with each retry up to a maximum
      * specified by maxRetryDelayInMs.
      */
    var retryDelayInMs: js.UndefOr[Double] = js.undefined
  }
  object RetryOptions {
    
    inline def apply(): RetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptions]
    }
    
    extension [Self <: RetryOptions](x: Self) {
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setMaxRetryDelayInMs(value: Double): Self = StObject.set(x, "maxRetryDelayInMs", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryDelayInMsUndefined: Self = StObject.set(x, "maxRetryDelayInMs", js.undefined)
      
      inline def setMode(value: RetryMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRetryDelayInMs(value: Double): Self = StObject.set(x, "retryDelayInMs", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayInMsUndefined: Self = StObject.set(x, "retryDelayInMs", js.undefined)
    }
  }
}
