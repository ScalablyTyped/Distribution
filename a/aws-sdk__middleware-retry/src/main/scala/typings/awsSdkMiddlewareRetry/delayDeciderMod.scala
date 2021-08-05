package typings.awsSdkMiddlewareRetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayDeciderMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/delayDecider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultDelayDecider(delayBase: Double, attempts: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDelayDecider")(delayBase.asInstanceOf[js.Any], attempts.asInstanceOf[js.Any])).asInstanceOf[Double]
}
