package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetLocationAttributesOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912. 
    */
  var FleetArn: js.UndefOr[typings.awsSdk.gameliftMod.FleetArn] = js.undefined
  
  /**
    * A unique identifier for the fleet that location attributes were requested for.
    */
  var FleetId: js.UndefOr[FleetIdOrArn] = js.undefined
  
  /**
    *  Location-specific information on the requested fleet's remote locations. 
    */
  var LocationAttributes: js.UndefOr[LocationAttributesList] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeFleetLocationAttributesOutput {
  
  inline def apply(): DescribeFleetLocationAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetLocationAttributesOutput]
  }
  
  extension [Self <: DescribeFleetLocationAttributesOutput](x: Self) {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setLocationAttributes(value: LocationAttributesList): Self = StObject.set(x, "LocationAttributes", value.asInstanceOf[js.Any])
    
    inline def setLocationAttributesUndefined: Self = StObject.set(x, "LocationAttributes", js.undefined)
    
    inline def setLocationAttributesVarargs(value: LocationAttributes*): Self = StObject.set(x, "LocationAttributes", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
