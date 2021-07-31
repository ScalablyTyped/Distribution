package typings.awsSdkMiddlewareRetry

import typings.awsSdkSmithyClient.sdkErrorMod.SdkError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryDeciderMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/retryDecider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defaultRetryDecider(error: SdkError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
