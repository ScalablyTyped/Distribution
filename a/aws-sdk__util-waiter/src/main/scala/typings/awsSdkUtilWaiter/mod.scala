package typings.awsSdkUtilWaiter

import typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterOptions
import typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-waiter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/util-waiter", "WaiterState")
  @js.native
  object WaiterState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterState & String] = js.native
    
    /* "ABORTED" */ val ABORTED: typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterState.ABORTED & String = js.native
    
    /* "FAILURE" */ val FAILURE: typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterState.FAILURE & String = js.native
    
    /* "RETRY" */ val RETRY: typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterState.RETRY & String = js.native
    
    /* "SUCCESS" */ val SUCCESS: typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterState.SUCCESS & String = js.native
    
    /* "TIMEOUT" */ val TIMEOUT: typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterState.TIMEOUT & String = js.native
  }
  
  inline def checkExceptions(result: WaiterResult): WaiterResult = ^.asInstanceOf[js.Dynamic].applyDynamic("checkExceptions")(result.asInstanceOf[js.Any]).asInstanceOf[WaiterResult]
  
  inline def createWaiter[Client, Input](
    options: WaiterOptions[Client],
    input: Input,
    acceptorChecks: js.Function2[/* client */ Client, /* input */ Input, js.Promise[WaiterResult]]
  ): js.Promise[WaiterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWaiter")(options.asInstanceOf[js.Any], input.asInstanceOf[js.Any], acceptorChecks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WaiterResult]]
  
  object waiterServiceDefaults {
    
    @JSImport("@aws-sdk/util-waiter", "waiterServiceDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@aws-sdk/util-waiter", "waiterServiceDefaults.maxDelay")
    @js.native
    def maxDelay: Double = js.native
    inline def maxDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDelay")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/util-waiter", "waiterServiceDefaults.minDelay")
    @js.native
    def minDelay: Double = js.native
    inline def minDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minDelay")(x.asInstanceOf[js.Any])
  }
}
