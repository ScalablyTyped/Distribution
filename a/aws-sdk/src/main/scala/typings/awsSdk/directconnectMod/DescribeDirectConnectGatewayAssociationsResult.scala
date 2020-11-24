package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDirectConnectGatewayAssociationsResult extends js.Object {
  
  /**
    * Information about the associations.
    */
  var directConnectGatewayAssociations: js.UndefOr[DirectConnectGatewayAssociationList] = js.native
  
  /**
    * The token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object DescribeDirectConnectGatewayAssociationsResult {
  
  @scala.inline
  def apply(): DescribeDirectConnectGatewayAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationsResult]
  }
  
  @scala.inline
  implicit class DescribeDirectConnectGatewayAssociationsResultOps[Self <: DescribeDirectConnectGatewayAssociationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectConnectGatewayAssociationsVarargs(value: DirectConnectGatewayAssociation*): Self = this.set("directConnectGatewayAssociations", js.Array(value :_*))
    
    @scala.inline
    def setDirectConnectGatewayAssociations(value: DirectConnectGatewayAssociationList): Self = this.set("directConnectGatewayAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGatewayAssociations: Self = this.set("directConnectGatewayAssociations", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
