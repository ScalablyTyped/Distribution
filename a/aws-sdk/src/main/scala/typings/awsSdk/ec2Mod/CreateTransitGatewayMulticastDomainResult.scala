package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayMulticastDomainResult extends js.Object {
  /**
    * Information about the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomain: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomain] = js.native
}

object CreateTransitGatewayMulticastDomainResult {
  @scala.inline
  def apply(TransitGatewayMulticastDomain: TransitGatewayMulticastDomain = null): CreateTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayMulticastDomain != null) __obj.updateDynamic("TransitGatewayMulticastDomain")(TransitGatewayMulticastDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayMulticastDomainResult]
  }
}

