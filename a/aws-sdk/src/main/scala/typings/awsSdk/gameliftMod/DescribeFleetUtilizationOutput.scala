package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetUtilizationOutput extends js.Object {
  
  /**
    * A collection of objects containing utilization information for each requested fleet ID.
    */
  var FleetUtilization: js.UndefOr[FleetUtilizationList] = js.native
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribeFleetUtilizationOutput {
  
  @scala.inline
  def apply(): DescribeFleetUtilizationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetUtilizationOutput]
  }
  
  @scala.inline
  implicit class DescribeFleetUtilizationOutputOps[Self <: DescribeFleetUtilizationOutput] (val x: Self) extends AnyVal {
    
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
    def setFleetUtilizationVarargs(value: FleetUtilization*): Self = this.set("FleetUtilization", js.Array(value :_*))
    
    @scala.inline
    def setFleetUtilization(value: FleetUtilizationList): Self = this.set("FleetUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetUtilization: Self = this.set("FleetUtilization", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
