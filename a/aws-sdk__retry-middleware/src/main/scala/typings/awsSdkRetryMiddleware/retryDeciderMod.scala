package typings.awsSdkRetryMiddleware

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryDeciderMod {
  
  @JSImport("@aws-sdk/retry-middleware/build/retryDecider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultRetryDecider(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")().asInstanceOf[js.Any]
  inline def defaultRetryDecider(retryClockSkewErrors: Boolean): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")(retryClockSkewErrors.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
