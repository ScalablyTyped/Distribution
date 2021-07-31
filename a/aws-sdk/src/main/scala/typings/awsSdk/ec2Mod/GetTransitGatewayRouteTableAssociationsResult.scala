package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayRouteTableAssociationsResult extends StObject {
  
  /**
    * Information about the associations.
    */
  var Associations: js.UndefOr[TransitGatewayRouteTableAssociationList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetTransitGatewayRouteTableAssociationsResult {
  
  @scala.inline
  def apply(): GetTransitGatewayRouteTableAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayRouteTableAssociationsResult]
  }
  
  @scala.inline
  implicit class GetTransitGatewayRouteTableAssociationsResultMutableBuilder[Self <: GetTransitGatewayRouteTableAssociationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociations(value: TransitGatewayRouteTableAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    @scala.inline
    def setAssociationsVarargs(value: TransitGatewayRouteTableAssociation*): Self = StObject.set(x, "Associations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
