package typings.awsSdkUtilWaiter

import typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterOptions
import typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCreateWaiterMod {
  
  @JSImport("@aws-sdk/util-waiter/dist-types/createWaiter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWaiter[Client, Input](
    options: WaiterOptions[Client],
    input: Input,
    acceptorChecks: js.Function2[/* client */ Client, /* input */ Input, js.Promise[WaiterResult]]
  ): js.Promise[WaiterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWaiter")(options.asInstanceOf[js.Any], input.asInstanceOf[js.Any], acceptorChecks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WaiterResult]]
}
