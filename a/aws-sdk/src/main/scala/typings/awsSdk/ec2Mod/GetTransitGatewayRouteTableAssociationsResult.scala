package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTransitGatewayRouteTableAssociationsResult extends js.Object {
  
  /**
    * Information about the associations.
    */
  var Associations: js.UndefOr[TransitGatewayRouteTableAssociationList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object GetTransitGatewayRouteTableAssociationsResult {
  
  @scala.inline
  def apply(): GetTransitGatewayRouteTableAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayRouteTableAssociationsResult]
  }
  
  @scala.inline
  implicit class GetTransitGatewayRouteTableAssociationsResultOps[Self <: GetTransitGatewayRouteTableAssociationsResult] (val x: Self) extends AnyVal {
    
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
    def setAssociationsVarargs(value: TransitGatewayRouteTableAssociation*): Self = this.set("Associations", js.Array(value :_*))
    
    @scala.inline
    def setAssociations(value: TransitGatewayRouteTableAssociationList): Self = this.set("Associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociations: Self = this.set("Associations", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
