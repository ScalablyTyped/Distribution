package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFleetsOutput extends js.Object {
  /**
    * Set of fleet IDs matching the list request. You can retrieve additional information about all returned fleets by passing this result set to a call to DescribeFleetAttributes, DescribeFleetCapacity, or DescribeFleetUtilization.
    */
  var FleetIds: js.UndefOr[FleetIdList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object ListFleetsOutput {
  @scala.inline
  def apply(): ListFleetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsOutput]
  }
  @scala.inline
  implicit class ListFleetsOutputOps[Self <: ListFleetsOutput] (val x: Self) extends AnyVal {
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
    def setFleetIdsVarargs(value: FleetId*): Self = this.set("FleetIds", js.Array(value :_*))
    @scala.inline
    def setFleetIds(value: FleetIdList): Self = this.set("FleetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetIds: Self = this.set("FleetIds", js.undefined)
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

