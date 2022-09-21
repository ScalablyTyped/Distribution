package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetUtilizationOutput extends StObject {
  
  /**
    * A collection of objects containing utilization information for each requested fleet ID. Utilization objects are returned only for fleets that currently exist.
    */
  var FleetUtilization: js.UndefOr[FleetUtilizationList] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeFleetUtilizationOutput {
  
  inline def apply(): DescribeFleetUtilizationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetUtilizationOutput]
  }
  
  extension [Self <: DescribeFleetUtilizationOutput](x: Self) {
    
    inline def setFleetUtilization(value: FleetUtilizationList): Self = StObject.set(x, "FleetUtilization", value.asInstanceOf[js.Any])
    
    inline def setFleetUtilizationUndefined: Self = StObject.set(x, "FleetUtilization", js.undefined)
    
    inline def setFleetUtilizationVarargs(value: FleetUtilization*): Self = StObject.set(x, "FleetUtilization", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
