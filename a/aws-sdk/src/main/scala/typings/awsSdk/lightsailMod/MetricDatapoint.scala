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
    average: Int | Double = null,
    maximum: Int | Double = null,
    minimum: Int | Double = null,
    sampleCount: Int | Double = null,
    sum: Int | Double = null,
    timestamp: timestamp = null,
    unit: MetricUnit = null
  ): MetricDatapoint = {
    val __obj = js.Dynamic.literal()
    if (average != null) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (sampleCount != null) __obj.updateDynamic("sampleCount")(sampleCount.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDatapoint]
  }
}

