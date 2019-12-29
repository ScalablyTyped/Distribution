package typings.atAwsDashSdkCredentialDashProviderDashImds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-imds/build/remoteProvider/retry", JSImport.Namespace)
@js.native
object buildRemoteProviderRetryMod extends js.Object {
  def retry[T](toRetry: RetryableProvider[T], maxRetries: Double): js.Promise[T] = js.native
  type RetryableProvider[T] = js.Function0[js.Promise[T]]
}

