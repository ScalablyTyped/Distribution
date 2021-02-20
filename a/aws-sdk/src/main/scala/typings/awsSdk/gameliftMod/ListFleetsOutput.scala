package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFleetsOutput extends StObject {
  
  /**
    * Set of fleet IDs matching the list request. You can retrieve additional information about all returned fleets by passing this result set to a call to DescribeFleetAttributes, DescribeFleetCapacity, or DescribeFleetUtilization.
    */
  var FleetIds: js.UndefOr[FleetIdList] = js.native
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
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
  implicit class ListFleetsOutputMutableBuilder[Self <: ListFleetsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetIds(value: FleetIdList): Self = StObject.set(x, "FleetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdsUndefined: Self = StObject.set(x, "FleetIds", js.undefined)
    
    @scala.inline
    def setFleetIdsVarargs(value: FleetId*): Self = StObject.set(x, "FleetIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
