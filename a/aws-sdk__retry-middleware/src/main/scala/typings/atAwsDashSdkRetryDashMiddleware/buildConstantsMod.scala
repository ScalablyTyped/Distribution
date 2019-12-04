package typings.atAwsDashSdkRetryDashMiddleware

import typings.atAwsDashSdkRetryDashMiddleware.atAwsDashSdkRetryDashMiddlewareNumbers.`100`
import typings.atAwsDashSdkRetryDashMiddleware.atAwsDashSdkRetryDashMiddlewareNumbers.`500`
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/retry-middleware/build/constants", JSImport.Namespace)
@js.native
object buildConstantsMod extends js.Object {
  val DEFAULT_RETRY_DELAY_BASE: `100` = js.native
  val MAXIMUM_RETRY_DELAY: Double = js.native
  val RETRYABLE_STATUS_CODES: Set[Double] = js.native
  val THROTTLING_RETRY_DELAY_BASE: `500` = js.native
}

