package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayMulticastDomain extends js.Object {
  /**
    * The time the transit gateway multicast domain was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  /**
    * The state of the transit gateway multicast domain.
    */
  var State: js.UndefOr[TransitGatewayMulticastDomainState] = js.native
  /**
    * The tags for the transit gateway multicast domain.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: js.UndefOr[String] = js.native
}

object TransitGatewayMulticastDomain {
  @scala.inline
  def apply(
    CreationTime: DateTime = null,
    State: TransitGatewayMulticastDomainState = null,
    Tags: TagList = null,
    TransitGatewayId: String = null,
    TransitGatewayMulticastDomainId: String = null
  ): TransitGatewayMulticastDomain = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId.asInstanceOf[js.Any])
    if (TransitGatewayMulticastDomainId != null) __obj.updateDynamic("TransitGatewayMulticastDomainId")(TransitGatewayMulticastDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayMulticastDomain]
  }
}

