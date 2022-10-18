package typings.awsSdkRetryMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRetryDeciderMod {
  
  @JSImport("@aws-sdk/retry-middleware/build/retryDecider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultRetryDecider(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")().asInstanceOf[Any]
  inline def defaultRetryDecider(retryClockSkewErrors: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")(retryClockSkewErrors.asInstanceOf[js.Any]).asInstanceOf[Any]
}
