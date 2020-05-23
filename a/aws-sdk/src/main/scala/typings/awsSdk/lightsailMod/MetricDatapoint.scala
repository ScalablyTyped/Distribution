package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDatapoint extends js.Object {
  /**
    * The average.
    */
  var average: js.UndefOr[double] = js.native
  /**
    * The maximum.
    */
  var maximum: js.UndefOr[double] = js.native
  /**
    * The minimum.
    */
  var minimum: js.UndefOr[double] = js.native
  /**
    * The sample count.
    */
  var sampleCount: js.UndefOr[double] = js.native
  /**
    * The sum.
    */
  var sum: js.UndefOr[double] = js.native
  /**
    * The timestamp (e.g., 1479816991.349).
    */
  var timestamp: js.UndefOr[typings.awsSdk.lightsailMod.timestamp] = js.native
  /**
    * The unit. 
    */
  var unit: js.UndefOr[MetricUnit] = js.native
}

object MetricDatapoint {
  @scala.inline
  def apply(
    average: js.UndefOr[double] = js.undefined,
    maximum: js.UndefOr[double] = js.undefined,
    minimum: js.UndefOr[double] = js.undefined,
    sampleCount: js.UndefOr[double] = js.undefined,
    sum: js.UndefOr[double] = js.undefined,
    timestamp: timestamp = null,
    unit: MetricUnit = null
  ): MetricDatapoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(average)) __obj.updateDynamic("average")(average.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleCount)) __obj.updateDynamic("sampleCount")(sampleCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sum)) __obj.updateDynamic("sum")(sum.get.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDatapoint]
  }
}

