package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLocalGatewayRouteTableVpcAssociationResult extends StObject {
  
  /**
    * Information about the association.
    */
  var LocalGatewayRouteTableVpcAssociation: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociation] = js.native
}
object DeleteLocalGatewayRouteTableVpcAssociationResult {
  
  @scala.inline
  def apply(): DeleteLocalGatewayRouteTableVpcAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLocalGatewayRouteTableVpcAssociationResult]
  }
  
  @scala.inline
  implicit class DeleteLocalGatewayRouteTableVpcAssociationResultMutableBuilder[Self <: DeleteLocalGatewayRouteTableVpcAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalGatewayRouteTableVpcAssociation(value: LocalGatewayRouteTableVpcAssociation): Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableVpcAssociationUndefined: Self = StObject.set(x, "LocalGatewayRouteTableVpcAssociation", js.undefined)
  }
}
