package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedValue extends js.Object {
  /**
    * The quality of the aggregated data.
    */
  var quality: js.UndefOr[Quality] = js.native
  /**
    * The date the aggregating computations occurred, in Unix epoch time.
    */
  var timestamp: Timestamp = js.native
  /**
    * The value of the aggregates.
    */
  var value: Aggregates = js.native
}

object AggregatedValue {
  @scala.inline
  def apply(timestamp: Timestamp, value: Aggregates, quality: Quality = null): AggregatedValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedValue]
  }
}

