package typings.awsSdkUtilWaiter

import typings.awsSdkTypes.distTypesAbortMod.AbortController
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWaiterMod {
  
  @JSImport("@aws-sdk/util-waiter/dist-types/waiter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait WaiterState extends StObject
  @JSImport("@aws-sdk/util-waiter/dist-types/waiter", "WaiterState")
  @js.native
  object WaiterState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WaiterState & String] = js.native
    
    @js.native
    sealed trait ABORTED
      extends StObject
         with WaiterState
    /* "ABORTED" */ val ABORTED: typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterState.ABORTED & String = js.native
    
    @js.native
    sealed trait FAILURE
      extends StObject
         with WaiterState
    /* "FAILURE" */ val FAILURE: typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterState.FAILURE & String = js.native
    
    @js.native
    sealed trait RETRY
      extends StObject
         with WaiterState
    /* "RETRY" */ val RETRY: typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterState.RETRY & String = js.native
    
    @js.native
    sealed trait SUCCESS
      extends StObject
         with WaiterState
    /* "SUCCESS" */ val SUCCESS: typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterState.SUCCESS & String = js.native
    
    @js.native
    sealed trait TIMEOUT
      extends StObject
         with WaiterState
    /* "TIMEOUT" */ val TIMEOUT: typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterState.TIMEOUT & String = js.native
  }
  
  inline def checkExceptions(result: WaiterResult): WaiterResult = ^.asInstanceOf[js.Dynamic].applyDynamic("checkExceptions")(result.asInstanceOf[js.Any]).asInstanceOf[WaiterResult]
  
  object waiterServiceDefaults {
    
    @JSImport("@aws-sdk/util-waiter/dist-types/waiter", "waiterServiceDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@aws-sdk/util-waiter/dist-types/waiter", "waiterServiceDefaults.maxDelay")
    @js.native
    def maxDelay: Double = js.native
    inline def maxDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDelay")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/util-waiter/dist-types/waiter", "waiterServiceDefaults.minDelay")
    @js.native
    def minDelay: Double = js.native
    inline def minDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minDelay")(x.asInstanceOf[js.Any])
  }
  
  type WaiterConfiguration[T] = typings.awsSdkTypes.distTypesWaiterMod.WaiterConfiguration[T]
  
  /* Inlined @aws-sdk/util-waiter.@aws-sdk/util-waiter/dist-types/waiter.WaiterConfiguration<Client> & std.Required<std.Pick<@aws-sdk/util-waiter.@aws-sdk/util-waiter/dist-types/waiter.WaiterConfiguration<Client>, 'minDelay' | 'maxDelay'>> */
  trait WaiterOptions[Client] extends StObject {
    
    /**
      * @deprecated Use abortSignal
      * Abort controller. Used for ending the waiter early.
      */
    var abortController: js.UndefOr[AbortController] = js.undefined
    
    /**
      * Abort Signal. Used for ending the waiter early.
      */
    var abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Required service client
      */
    var client: Client
    
    /**
      * The maximum amount of time to delay between retries in seconds. This is the
      * ceiling of the exponential backoff. This value defaults to service default
      * if not specified. If specified, this value MUST be greater than or equal to 1.
      */
    var maxDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time in seconds a user is willing to wait for a waiter to complete.
      */
    var maxWaitTime: Double
    
    /**
      * The minimum amount of time to delay between retries in seconds. This is the
      * floor of the exponential backoff. This value defaults to service default
      * if not specified. This value MUST be less than or equal to maxDelay and greater than 0.
      */
    var minDelay: js.UndefOr[Double] = js.undefined
  }
  object WaiterOptions {
    
    inline def apply[Client](client: Client, maxWaitTime: Double): WaiterOptions[Client] = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], maxWaitTime = maxWaitTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaiterOptions[Client]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaiterOptions[?], Client] (val x: Self & WaiterOptions[Client]) extends AnyVal {
      
      inline def setAbortController(value: AbortController): Self = StObject.set(x, "abortController", value.asInstanceOf[js.Any])
      
      inline def setAbortControllerUndefined: Self = StObject.set(x, "abortController", js.undefined)
      
      inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      inline def setMaxWaitTime(value: Double): Self = StObject.set(x, "maxWaitTime", value.asInstanceOf[js.Any])
      
      inline def setMinDelay(value: Double): Self = StObject.set(x, "minDelay", value.asInstanceOf[js.Any])
      
      inline def setMinDelayUndefined: Self = StObject.set(x, "minDelay", js.undefined)
    }
  }
  
  trait WaiterResult extends StObject {
    
    /**
      * (optional) Indicates a reason for why a waiter has reached its state.
      */
    var reason: js.UndefOr[Any] = js.undefined
    
    var state: WaiterState
  }
  object WaiterResult {
    
    inline def apply(state: WaiterState): WaiterResult = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaiterResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaiterResult] (val x: Self) extends AnyVal {
      
      inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setState(value: WaiterState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
