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
  def apply(timestamp: Timestamp, value: Aggregates): AggregatedValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedValue]
  }
  @scala.inline
  implicit class AggregatedValueOps[Self <: AggregatedValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Aggregates): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: Quality): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

