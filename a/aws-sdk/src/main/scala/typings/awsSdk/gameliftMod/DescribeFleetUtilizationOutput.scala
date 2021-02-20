package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetUtilizationOutput extends StObject {
  
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
  implicit class DescribeFleetUtilizationOutputMutableBuilder[Self <: DescribeFleetUtilizationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetUtilization(value: FleetUtilizationList): Self = StObject.set(x, "FleetUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetUtilizationUndefined: Self = StObject.set(x, "FleetUtilization", js.undefined)
    
    @scala.inline
    def setFleetUtilizationVarargs(value: FleetUtilization*): Self = StObject.set(x, "FleetUtilization", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
