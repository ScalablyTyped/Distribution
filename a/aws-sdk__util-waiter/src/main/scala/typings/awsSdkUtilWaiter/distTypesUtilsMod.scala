package typings.awsSdkUtilWaiter

import typings.awsSdkUtilWaiter.distTypesWaiterMod.WaiterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsMod {
  
  @JSImport("@aws-sdk/util-waiter/dist-types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sleep(seconds: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(seconds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def validateWaiterOptions[Client](options: WaiterOptions[Client]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateWaiterOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
