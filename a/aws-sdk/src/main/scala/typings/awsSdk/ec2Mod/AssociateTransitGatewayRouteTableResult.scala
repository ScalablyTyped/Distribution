package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateTransitGatewayRouteTableResult extends js.Object {
  
  /**
    * The ID of the association.
    */
  var Association: js.UndefOr[TransitGatewayAssociation] = js.native
}
object AssociateTransitGatewayRouteTableResult {
  
  @scala.inline
  def apply(): AssociateTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTransitGatewayRouteTableResult]
  }
  
  @scala.inline
  implicit class AssociateTransitGatewayRouteTableResultOps[Self <: AssociateTransitGatewayRouteTableResult] (val x: Self) extends AnyVal {
    
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
    def setAssociation(value: TransitGatewayAssociation): Self = this.set("Association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociation: Self = this.set("Association", js.undefined)
  }
}
