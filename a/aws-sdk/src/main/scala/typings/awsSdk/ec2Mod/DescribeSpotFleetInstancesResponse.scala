package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSpotFleetInstancesResponse extends js.Object {
  /**
    * The running instances. This list is refreshed periodically and might be out of date.
    */
  var ActiveInstances: js.UndefOr[ActiveInstanceSet] = js.native
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
}

object DescribeSpotFleetInstancesResponse {
  @scala.inline
  def apply(): DescribeSpotFleetInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotFleetInstancesResponse]
  }
  @scala.inline
  implicit class DescribeSpotFleetInstancesResponseOps[Self <: DescribeSpotFleetInstancesResponse] (val x: Self) extends AnyVal {
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
    def setActiveInstancesVarargs(value: ActiveInstance*): Self = this.set("ActiveInstances", js.Array(value :_*))
    @scala.inline
    def setActiveInstances(value: ActiveInstanceSet): Self = this.set("ActiveInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveInstances: Self = this.set("ActiveInstances", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSpotFleetRequestId(value: String): Self = this.set("SpotFleetRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotFleetRequestId: Self = this.set("SpotFleetRequestId", js.undefined)
  }
  
}

