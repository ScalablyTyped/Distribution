package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEC2RecommendationProjectedMetricsRequest extends js.Object {
  /**
    * The time stamp of the last projected metrics data point to return.
    */
  var endTime: Timestamp = js.native
  /**
    * The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.
    */
  var instanceArn: InstanceArn = js.native
  /**
    * The granularity, in seconds, of the projected metrics data points.
    */
  var period: Period = js.native
  /**
    * The time stamp of the first projected metrics data point to return.
    */
  var startTime: Timestamp = js.native
  /**
    * The statistic of the projected metrics.
    */
  var stat: MetricStatistic = js.native
}

object GetEC2RecommendationProjectedMetricsRequest {
  @scala.inline
  def apply(
    endTime: Timestamp,
    instanceArn: InstanceArn,
    period: Period,
    startTime: Timestamp,
    stat: MetricStatistic
  ): GetEC2RecommendationProjectedMetricsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], instanceArn = instanceArn.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEC2RecommendationProjectedMetricsRequest]
  }
}

