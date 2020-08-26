package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetAttributesOutput extends js.Object {
  /**
    * A collection of objects containing attribute metadata for each requested fleet ID. Attribute objects are returned only for fleets that currently exist.
    */
  var FleetAttributes: js.UndefOr[FleetAttributesList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeFleetAttributesOutput {
  @scala.inline
  def apply(): DescribeFleetAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAttributesOutput]
  }
  @scala.inline
  implicit class DescribeFleetAttributesOutputOps[Self <: DescribeFleetAttributesOutput] (val x: Self) extends AnyVal {
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
    def setFleetAttributesVarargs(value: FleetAttributes*): Self = this.set("FleetAttributes", js.Array(value :_*))
    @scala.inline
    def setFleetAttributes(value: FleetAttributesList): Self = this.set("FleetAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetAttributes: Self = this.set("FleetAttributes", js.undefined)
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

