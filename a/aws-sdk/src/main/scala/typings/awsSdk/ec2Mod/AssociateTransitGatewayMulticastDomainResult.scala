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
  def apply(Associations: TransitGatewayMulticastDomainAssociations = null): AssociateTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    if (Associations != null) __obj.updateDynamic("Associations")(Associations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTransitGatewayMulticastDomainResult]
  }
}

