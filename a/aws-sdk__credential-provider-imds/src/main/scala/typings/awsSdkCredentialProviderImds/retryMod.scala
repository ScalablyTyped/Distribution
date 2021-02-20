package typings.awsSdkCredentialProviderImds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider/retry", "retry")
  @js.native
  def retry[T](toRetry: RetryableProvider[T], maxRetries: Double): js.Promise[T] = js.native
  
  type RetryableProvider[T] = js.Function0[js.Promise[T]]
}
