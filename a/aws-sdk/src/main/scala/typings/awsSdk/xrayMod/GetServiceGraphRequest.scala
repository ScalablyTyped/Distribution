package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceGraphRequest extends js.Object {
  /**
    * The end of the timeframe for which to generate a graph.
    */
  var EndTime: Timestamp = js.native
  /**
    * The ARN of a group to generate a graph based on.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.xrayMod.GroupARN] = js.native
  /**
    * The name of a group to generate a graph based on.
    */
  var GroupName: js.UndefOr[typings.awsSdk.xrayMod.GroupName] = js.native
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The start of the time frame for which to generate a graph.
    */
  var StartTime: Timestamp = js.native
}

object GetServiceGraphRequest {
  @scala.inline
  def apply(EndTime: Timestamp, StartTime: Timestamp): GetServiceGraphRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceGraphRequest]
  }
  @scala.inline
  implicit class GetServiceGraphRequestOps[Self <: GetServiceGraphRequest] (val x: Self) extends AnyVal {
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
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupARN(value: GroupARN): Self = this.set("GroupARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupARN: Self = this.set("GroupARN", js.undefined)
    @scala.inline
    def setGroupName(value: GroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

