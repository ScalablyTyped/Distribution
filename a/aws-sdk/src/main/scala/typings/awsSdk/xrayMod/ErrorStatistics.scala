package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorStatistics extends js.Object {
  /**
    * The number of requests that failed with untracked 4xx Client Error status codes.
    */
  var OtherCount: js.UndefOr[NullableLong] = js.native
  /**
    * The number of requests that failed with a 419 throttling status code.
    */
  var ThrottleCount: js.UndefOr[NullableLong] = js.native
  /**
    * The total number of requests that failed with a 4xx Client Error status code.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.native
}

object ErrorStatistics {
  @scala.inline
  def apply(
    OtherCount: Int | scala.Double = null,
    ThrottleCount: Int | scala.Double = null,
    TotalCount: Int | scala.Double = null
  ): ErrorStatistics = {
    val __obj = js.Dynamic.literal()
    if (OtherCount != null) __obj.updateDynamic("OtherCount")(OtherCount.asInstanceOf[js.Any])
    if (ThrottleCount != null) __obj.updateDynamic("ThrottleCount")(ThrottleCount.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorStatistics]
  }
}

