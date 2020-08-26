package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetCapacityOutput extends js.Object {
  /**
    * A collection of objects containing capacity information for each requested fleet ID. Leave this parameter empty to retrieve capacity information for all fleets.
    */
  var FleetCapacity: js.UndefOr[FleetCapacityList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeFleetCapacityOutput {
  @scala.inline
  def apply(): DescribeFleetCapacityOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetCapacityOutput]
  }
  @scala.inline
  implicit class DescribeFleetCapacityOutputOps[Self <: DescribeFleetCapacityOutput] (val x: Self) extends AnyVal {
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
    def setFleetCapacityVarargs(value: FleetCapacity*): Self = this.set("FleetCapacity", js.Array(value :_*))
    @scala.inline
    def setFleetCapacity(value: FleetCapacityList): Self = this.set("FleetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetCapacity: Self = this.set("FleetCapacity", js.undefined)
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

