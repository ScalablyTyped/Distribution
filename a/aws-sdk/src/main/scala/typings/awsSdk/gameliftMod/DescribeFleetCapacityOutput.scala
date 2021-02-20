package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetCapacityOutput extends StObject {
  
  /**
    * A collection of objects containing capacity information for each requested fleet ID. Leave this parameter empty to retrieve capacity information for all fleets.
    */
  var FleetCapacity: js.UndefOr[FleetCapacityList] = js.native
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
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
  implicit class DescribeFleetCapacityOutputMutableBuilder[Self <: DescribeFleetCapacityOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetCapacity(value: FleetCapacityList): Self = StObject.set(x, "FleetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetCapacityUndefined: Self = StObject.set(x, "FleetCapacity", js.undefined)
    
    @scala.inline
    def setFleetCapacityVarargs(value: FleetCapacity*): Self = StObject.set(x, "FleetCapacity", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
