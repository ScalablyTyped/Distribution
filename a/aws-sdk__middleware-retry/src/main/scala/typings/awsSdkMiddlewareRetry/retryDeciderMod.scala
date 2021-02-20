package typings.awsSdkMiddlewareRetry

import typings.awsSdkSmithyClient.sdkErrorMod.SdkError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryDeciderMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/retryDecider", "defaultRetryDecider")
  @js.native
  def defaultRetryDecider(error: SdkError): Boolean = js.native
}
