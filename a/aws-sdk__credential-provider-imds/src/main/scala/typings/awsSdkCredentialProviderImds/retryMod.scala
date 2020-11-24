package typings.awsSdkCredentialProviderImds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/credential-provider-imds/dist/cjs/remoteProvider/retry", JSImport.Namespace)
@js.native
object retryMod extends js.Object {
  
  def retry[T](toRetry: RetryableProvider[T], maxRetries: Double): js.Promise[T] = js.native
  
  type RetryableProvider[T] = js.Function0[js.Promise[T]]
}
