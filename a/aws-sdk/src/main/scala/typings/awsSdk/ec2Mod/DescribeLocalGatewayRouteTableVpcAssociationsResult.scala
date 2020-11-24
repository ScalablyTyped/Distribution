package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocalGatewayRouteTableVpcAssociationsResult extends js.Object {
  
  /**
    * Information about the associations.
    */
  var LocalGatewayRouteTableVpcAssociations: js.UndefOr[LocalGatewayRouteTableVpcAssociationSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeLocalGatewayRouteTableVpcAssociationsResult {
  
  @scala.inline
  def apply(): DescribeLocalGatewayRouteTableVpcAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayRouteTableVpcAssociationsResult]
  }
  
  @scala.inline
  implicit class DescribeLocalGatewayRouteTableVpcAssociationsResultOps[Self <: DescribeLocalGatewayRouteTableVpcAssociationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocalGatewayRouteTableVpcAssociationsVarargs(value: LocalGatewayRouteTableVpcAssociation*): Self = this.set("LocalGatewayRouteTableVpcAssociations", js.Array(value :_*))
    
    @scala.inline
    def setLocalGatewayRouteTableVpcAssociations(value: LocalGatewayRouteTableVpcAssociationSet): Self = this.set("LocalGatewayRouteTableVpcAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayRouteTableVpcAssociations: Self = this.set("LocalGatewayRouteTableVpcAssociations", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
