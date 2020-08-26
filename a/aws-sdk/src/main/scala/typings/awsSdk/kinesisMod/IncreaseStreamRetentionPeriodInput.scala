package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncreaseStreamRetentionPeriodInput extends js.Object {
  /**
    * The new retention period of the stream, in hours. Must be more than the current retention period.
    */
  var RetentionPeriodHours: typings.awsSdk.kinesisMod.RetentionPeriodHours = js.native
  /**
    * The name of the stream to modify.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}

object IncreaseStreamRetentionPeriodInput {
  @scala.inline
  def apply(RetentionPeriodHours: RetentionPeriodHours, StreamName: StreamName): IncreaseStreamRetentionPeriodInput = {
    val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseStreamRetentionPeriodInput]
  }
  @scala.inline
  implicit class IncreaseStreamRetentionPeriodInputOps[Self <: IncreaseStreamRetentionPeriodInput] (val x: Self) extends AnyVal {
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
    def setRetentionPeriodHours(value: RetentionPeriodHours): Self = this.set("RetentionPeriodHours", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
  }
  
}

