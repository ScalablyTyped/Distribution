package typings.awsSdkMiddlewareRetry

import typings.awsSdkSmithyClient.sdkErrorMod.SdkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-retry/dist/cjs/retryDecider", JSImport.Namespace)
@js.native
object retryDeciderMod extends js.Object {
  
  def defaultRetryDecider(error: SdkError): Boolean = js.native
}
