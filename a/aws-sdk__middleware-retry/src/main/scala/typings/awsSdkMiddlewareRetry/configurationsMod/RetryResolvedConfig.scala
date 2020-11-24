package typings.awsSdkMiddlewareRetry.configurationsMod

import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RetryStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryResolvedConfig extends js.Object {
  
  def maxAttempts(): js.Promise[Double] = js.native
  @JSName("maxAttempts")
  var maxAttempts_Original: Provider[Double] = js.native
  
  var retryStrategy: RetryStrategy = js.native
}
