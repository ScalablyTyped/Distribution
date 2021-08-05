package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocalGatewayRouteTableVpcAssociationsResult extends StObject {
  
  /**
    * Information about the associations.
    */
  var LocalGatewayRouteTableVpcAssociations: js.UndefOr[LocalGatewayRouteTableVpcAssociationSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeLocalGatewayRouteTableVpcAssociationsResult {
  
  inline def apply(): DescribeLocalGatewayRouteTableVpcAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayRouteTableVpcAssociationsResult]
  }
  
  extension [Self <: DescribeLocalGatewayRouteTableVpcAssociationsResult](x: Self) {
    
    inline def setLocalGatewayRouteTableVpcAssociations(value: LocalGatewayRouteTableVpcAssociationSet): Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociations", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableVpcAssociationsUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociations", js.undefined)
    
    inline def setLocalGatewayRouteTableVpcAssociationsVarargs(value: LocalGatewayRouteTableVpcAssociation*): Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociations", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
