package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestConfig extends js.Object {
  /**
    * The progress of the Spot Fleet request. If there is an error, the status is error. After all requests are placed, the status is pending_fulfillment. If the size of the fleet is equal to or greater than its target capacity, the status is fulfilled. If the size of the fleet is decreased, the status is pending_termination while Spot Instances are terminating.
    */
  var ActivityStatus: js.UndefOr[typings.awsSdk.ec2Mod.ActivityStatus] = js.native
  /**
    * The creation date and time of the request.
    */
  var CreateTime: js.UndefOr[MillisecondDateTime] = js.native
  /**
    * The configuration of the Spot Fleet request.
    */
  var SpotFleetRequestConfig: js.UndefOr[SpotFleetRequestConfigData] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
  /**
    * The state of the Spot Fleet request.
    */
  var SpotFleetRequestState: js.UndefOr[BatchState] = js.native
  /**
    * The tags for a Spot Fleet resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object SpotFleetRequestConfig {
  @scala.inline
  def apply(): SpotFleetRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetRequestConfig]
  }
  @scala.inline
  implicit class SpotFleetRequestConfigOps[Self <: SpotFleetRequestConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivityStatus(value: ActivityStatus): Self = this.set("ActivityStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityStatus: Self = this.set("ActivityStatus", js.undefined)
    @scala.inline
    def setCreateTime(value: MillisecondDateTime): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    @scala.inline
    def setSpotFleetRequestConfig(value: SpotFleetRequestConfigData): Self = this.set("SpotFleetRequestConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotFleetRequestConfig: Self = this.set("SpotFleetRequestConfig", js.undefined)
    @scala.inline
    def setSpotFleetRequestId(value: String): Self = this.set("SpotFleetRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotFleetRequestId: Self = this.set("SpotFleetRequestId", js.undefined)
    @scala.inline
    def setSpotFleetRequestState(value: BatchState): Self = this.set("SpotFleetRequestState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotFleetRequestState: Self = this.set("SpotFleetRequestState", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

