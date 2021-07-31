package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayRouteTablePropagationsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the route table propagations.
    */
  var TransitGatewayRouteTablePropagations: js.UndefOr[TransitGatewayRouteTablePropagationList] = js.undefined
}
object GetTransitGatewayRouteTablePropagationsResult {
  
  @scala.inline
  def apply(): GetTransitGatewayRouteTablePropagationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayRouteTablePropagationsResult]
  }
  
  @scala.inline
  implicit class GetTransitGatewayRouteTablePropagationsResultMutableBuilder[Self <: GetTransitGatewayRouteTablePropagationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayRouteTablePropagations(value: TransitGatewayRouteTablePropagationList): Self = StObject.set(x, "TransitGatewayRouteTablePropagations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRouteTablePropagationsUndefined: Self = StObject.set(x, "TransitGatewayRouteTablePropagations", js.undefined)
    
    @scala.inline
    def setTransitGatewayRouteTablePropagationsVarargs(value: TransitGatewayRouteTablePropagation*): Self = StObject.set(x, "TransitGatewayRouteTablePropagations", js.Array(value :_*))
  }
}
