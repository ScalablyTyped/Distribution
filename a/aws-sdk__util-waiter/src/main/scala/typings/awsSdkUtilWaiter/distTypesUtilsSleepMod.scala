package typings.awsSdkUtilWaiter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsSleepMod {
  
  @JSImport("@aws-sdk/util-waiter/dist-types/utils/sleep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sleep(seconds: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(seconds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
