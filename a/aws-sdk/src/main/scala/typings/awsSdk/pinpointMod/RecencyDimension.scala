package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecencyDimension extends js.Object {
  /**
    * The duration to use when determining whether an endpoint is active or inactive.
    */
  var Duration: typings.awsSdk.pinpointMod.Duration = js.native
  /**
    * The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active within the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active within the specified duration are included in the segment.
    */
  var RecencyType: typings.awsSdk.pinpointMod.RecencyType = js.native
}

object RecencyDimension {
  @scala.inline
  def apply(Duration: Duration, RecencyType: RecencyType): RecencyDimension = {
    val __obj = js.Dynamic.literal(Duration = Duration.asInstanceOf[js.Any], RecencyType = RecencyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecencyDimension]
  }
  @scala.inline
  implicit class RecencyDimensionOps[Self <: RecencyDimension] (val x: Self) extends AnyVal {
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
    def setDuration(value: Duration): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecencyType(value: RecencyType): Self = this.set("RecencyType", value.asInstanceOf[js.Any])
  }
  
}

