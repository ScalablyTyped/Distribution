package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetCapacityInput extends StObject {
  
  /**
    * A unique identifier for a fleet(s) to retrieve capacity information for. You can use either the fleet ID or ARN value.
    */
  var FleetIds: js.UndefOr[FleetIdOrArnList] = js.undefined
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is ignored when the request specifies one or a list of fleet IDs.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value. This parameter is ignored when the request specifies one or a list of fleet IDs.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeFleetCapacityInput {
  
  inline def apply(): DescribeFleetCapacityInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetCapacityInput]
  }
  
  extension [Self <: DescribeFleetCapacityInput](x: Self) {
    
    inline def setFleetIds(value: FleetIdOrArnList): Self = StObject.set(x, "FleetIds", value.asInstanceOf[js.Any])
    
    inline def setFleetIdsUndefined: Self = StObject.set(x, "FleetIds", js.undefined)
    
    inline def setFleetIdsVarargs(value: FleetIdOrArn*): Self = StObject.set(x, "FleetIds", js.Array(value :_*))
    
    inline def setLimit(value: PositiveInteger): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
