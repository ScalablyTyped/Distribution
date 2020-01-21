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
  def apply(Associations: TransitGatewayMulticastDomainAssociations = null): DisassociateTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    if (Associations != null) __obj.updateDynamic("Associations")(Associations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTransitGatewayMulticastDomainResult]
  }
}

