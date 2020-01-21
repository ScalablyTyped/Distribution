package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayPeeringAttachment extends js.Object {
  /**
    * Information about the accepter transit gateway.
    */
  var AccepterTgwInfo: js.UndefOr[PeeringTgwInfo] = js.native
  /**
    * The time the transit gateway peering attachment was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  /**
    * Information about the requester transit gateway.
    */
  var RequesterTgwInfo: js.UndefOr[PeeringTgwInfo] = js.native
  /**
    * The state of the transit gateway peering attachment.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.native
  /**
    * The status of the transit gateway peering attachment.
    */
  var Status: js.UndefOr[PeeringAttachmentStatus] = js.native
  /**
    * The tags for the transit gateway peering attachment.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the transit gateway peering attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.native
}

object TransitGatewayPeeringAttachment {
  @scala.inline
  def apply(
    AccepterTgwInfo: PeeringTgwInfo = null,
    CreationTime: DateTime = null,
    RequesterTgwInfo: PeeringTgwInfo = null,
    State: TransitGatewayAttachmentState = null,
    Status: PeeringAttachmentStatus = null,
    Tags: TagList = null,
    TransitGatewayAttachmentId: String = null
  ): TransitGatewayPeeringAttachment = {
    val __obj = js.Dynamic.literal()
    if (AccepterTgwInfo != null) __obj.updateDynamic("AccepterTgwInfo")(AccepterTgwInfo.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (RequesterTgwInfo != null) __obj.updateDynamic("RequesterTgwInfo")(RequesterTgwInfo.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TransitGatewayAttachmentId != null) __obj.updateDynamic("TransitGatewayAttachmentId")(TransitGatewayAttachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayPeeringAttachment]
  }
}

