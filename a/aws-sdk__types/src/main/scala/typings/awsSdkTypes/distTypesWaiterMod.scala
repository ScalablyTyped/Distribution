package typings.awsSdkTypes

import typings.awsSdkTypes.distTypesAbortMod.AbortController
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWaiterMod {
  
  trait WaiterConfiguration[Client] extends StObject {
    
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
  object WaiterConfiguration {
    
    inline def apply[Client](client: Client, maxWaitTime: Double): WaiterConfiguration[Client] = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], maxWaitTime = maxWaitTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaiterConfiguration[Client]]
    }
    
    extension [Self <: WaiterConfiguration[?], Client](x: Self & WaiterConfiguration[Client]) {
      
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
}
