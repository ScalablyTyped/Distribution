package typings.atAwsDashSdkRetryDashMiddleware

import typings.atAwsDashSdkTypes.buildUtilMod.RetryDecider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/retry-middleware/build/retryDecider", JSImport.Namespace)
@js.native
object buildRetryDeciderMod extends js.Object {
  def defaultRetryDecider(): RetryDecider = js.native
  def defaultRetryDecider(retryClockSkewErrors: Boolean): RetryDecider = js.native
}

