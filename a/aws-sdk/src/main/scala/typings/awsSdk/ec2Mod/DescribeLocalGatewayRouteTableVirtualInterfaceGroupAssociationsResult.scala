package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult extends StObject {
  
  /**
    * Information about the associations.
    */
  var LocalGatewayRouteTableVirtualInterfaceGroupAssociations: js.UndefOr[LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult {
  
  inline def apply(): DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult]
  }
  
  extension [Self <: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult](x: Self) {
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociations(value: LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet): Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociations", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociationsUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociations", js.undefined)
    
    inline def setLocalGatewayRouteTableVirtualInterfaceGroupAssociationsVarargs(value: LocalGatewayRouteTableVirtualInterfaceGroupAssociation*): Self = StObject.set(x, "LocalGatewayRouteTableVirtualInterfaceGroupAssociations", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
