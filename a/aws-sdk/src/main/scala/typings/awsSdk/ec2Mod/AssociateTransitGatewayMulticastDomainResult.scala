package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateTransitGatewayMulticastDomainResult extends js.Object {
  /**
    * Information about the transit gateway multicast domain associations.
    */
  var Associations: js.UndefOr[TransitGatewayMulticastDomainAssociations] = js.native
}

object AssociateTransitGatewayMulticastDomainResult {
  @scala.inline
  def apply(): AssociateTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTransitGatewayMulticastDomainResult]
  }
  @scala.inline
  implicit class AssociateTransitGatewayMulticastDomainResultOps[Self <: AssociateTransitGatewayMulticastDomainResult] (val x: Self) extends AnyVal {
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
    def setAssociations(value: TransitGatewayMulticastDomainAssociations): Self = this.set("Associations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociations: Self = this.set("Associations", js.undefined)
  }
  
}

