package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateTransitGatewayMulticastDomainResult extends js.Object {
  /**
    * Information about the association.
    */
  var Associations: js.UndefOr[TransitGatewayMulticastDomainAssociations] = js.native
}

object DisassociateTransitGatewayMulticastDomainResult {
  @scala.inline
  def apply(): DisassociateTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateTransitGatewayMulticastDomainResult]
  }
  @scala.inline
  implicit class DisassociateTransitGatewayMulticastDomainResultOps[Self <: DisassociateTransitGatewayMulticastDomainResult] (val x: Self) extends AnyVal {
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

