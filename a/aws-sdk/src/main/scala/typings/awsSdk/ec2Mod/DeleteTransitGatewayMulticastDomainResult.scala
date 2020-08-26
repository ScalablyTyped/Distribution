package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTransitGatewayMulticastDomainResult extends js.Object {
  /**
    * Information about the deleted transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomain: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomain] = js.native
}

object DeleteTransitGatewayMulticastDomainResult {
  @scala.inline
  def apply(): DeleteTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayMulticastDomainResult]
  }
  @scala.inline
  implicit class DeleteTransitGatewayMulticastDomainResultOps[Self <: DeleteTransitGatewayMulticastDomainResult] (val x: Self) extends AnyVal {
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
    def setTransitGatewayMulticastDomain(value: TransitGatewayMulticastDomain): Self = this.set("TransitGatewayMulticastDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayMulticastDomain: Self = this.set("TransitGatewayMulticastDomain", js.undefined)
  }
  
}

