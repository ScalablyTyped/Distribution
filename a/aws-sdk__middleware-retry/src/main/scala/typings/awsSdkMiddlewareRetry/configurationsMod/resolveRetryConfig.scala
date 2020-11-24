package typings.awsSdkMiddlewareRetry.configurationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-retry/dist/cjs/configurations", "resolveRetryConfig")
@js.native
object resolveRetryConfig extends js.Object {
  
  def apply[T](input: T with PreviouslyResolved with RetryInputConfig): T with RetryResolvedConfig = js.native
}
