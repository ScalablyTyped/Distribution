package typings.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  /**
    * The time when the message or event was sent. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.native
  /**
    * The content of the message or event.
    */
  var Content: js.UndefOr[ChatContent] = js.native
  /**
    * The type of content of the item.
    */
  var ContentType: js.UndefOr[ChatContentType] = js.native
  /**
    * The chat display name of the sender.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.connectparticipantMod.DisplayName] = js.native
  /**
    * The ID of the item.
    */
  var Id: js.UndefOr[ChatItemId] = js.native
  /**
    * The ID of the sender in the session.
    */
  var ParticipantId: js.UndefOr[typings.awsSdk.connectparticipantMod.ParticipantId] = js.native
  /**
    * The role of the sender. For example, is it a customer, agent, or system.
    */
  var ParticipantRole: js.UndefOr[typings.awsSdk.connectparticipantMod.ParticipantRole] = js.native
  /**
    * Type of the item: message or event. 
    */
  var Type: js.UndefOr[ChatItemType] = js.native
}

object Item {
  @scala.inline
  def apply(
    AbsoluteTime: Instant = null,
    Content: ChatContent = null,
    ContentType: ChatContentType = null,
    DisplayName: DisplayName = null,
    Id: ChatItemId = null,
    ParticipantId: ParticipantId = null,
    ParticipantRole: ParticipantRole = null,
    Type: ChatItemType = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (AbsoluteTime != null) __obj.updateDynamic("AbsoluteTime")(AbsoluteTime.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (ParticipantId != null) __obj.updateDynamic("ParticipantId")(ParticipantId.asInstanceOf[js.Any])
    if (ParticipantRole != null) __obj.updateDynamic("ParticipantRole")(ParticipantRole.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

