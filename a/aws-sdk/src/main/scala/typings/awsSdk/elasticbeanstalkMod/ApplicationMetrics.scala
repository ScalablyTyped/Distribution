package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationMetrics extends js.Object {
  /**
    * The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (request_count) within the most recent time slice of 10 seconds (duration).
    */
  var Duration: js.UndefOr[NullableInteger] = js.native
  /**
    * Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies are in seconds with one millisecond resolution.
    */
  var Latency: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Latency] = js.native
  /**
    * Average number of requests handled by the web server per second over the last 10 seconds.
    */
  var RequestCount: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.RequestCount] = js.native
  /**
    * Represents the percentage of requests over the last 10 seconds that resulted in each type of status code response.
    */
  var StatusCodes: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.StatusCodes] = js.native
}

object ApplicationMetrics {
  @scala.inline
  def apply(
    Duration: js.UndefOr[NullableInteger] = js.undefined,
    Latency: Latency = null,
    RequestCount: js.UndefOr[RequestCount] = js.undefined,
    StatusCodes: StatusCodes = null
  ): ApplicationMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration.get.asInstanceOf[js.Any])
    if (Latency != null) __obj.updateDynamic("Latency")(Latency.asInstanceOf[js.Any])
    if (!js.isUndefined(RequestCount)) __obj.updateDynamic("RequestCount")(RequestCount.get.asInstanceOf[js.Any])
    if (StatusCodes != null) __obj.updateDynamic("StatusCodes")(StatusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMetrics]
  }
}

