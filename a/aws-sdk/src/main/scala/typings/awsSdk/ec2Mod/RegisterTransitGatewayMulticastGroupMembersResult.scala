package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTransitGatewayMulticastGroupMembersResult extends js.Object {
  /**
    * Information about the registered transit gateway multicast group members.
    */
  var RegisteredMulticastGroupMembers: js.UndefOr[TransitGatewayMulticastRegisteredGroupMembers] = js.native
}

object RegisterTransitGatewayMulticastGroupMembersResult {
  @scala.inline
  def apply(RegisteredMulticastGroupMembers: TransitGatewayMulticastRegisteredGroupMembers = null): RegisterTransitGatewayMulticastGroupMembersResult = {
    val __obj = js.Dynamic.literal()
    if (RegisteredMulticastGroupMembers != null) __obj.updateDynamic("RegisteredMulticastGroupMembers")(RegisteredMulticastGroupMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTransitGatewayMulticastGroupMembersResult]
  }
}

