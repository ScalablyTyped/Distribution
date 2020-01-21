package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandshakeFilter extends js.Object {
  /**
    * Specifies the type of handshake action. If you specify ActionType, you cannot also specify ParentHandshakeId.
    */
  var ActionType: js.UndefOr[typings.awsSdk.organizationsMod.ActionType] = js.native
  /**
    * Specifies the parent handshake. Only used for handshake types that are a child of another type. If you specify ParentHandshakeId, you cannot also specify ActionType. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
    */
  var ParentHandshakeId: js.UndefOr[HandshakeId] = js.native
}

object HandshakeFilter {
  @scala.inline
  def apply(ActionType: ActionType = null, ParentHandshakeId: HandshakeId = null): HandshakeFilter = {
    val __obj = js.Dynamic.literal()
    if (ActionType != null) __obj.updateDynamic("ActionType")(ActionType.asInstanceOf[js.Any])
    if (ParentHandshakeId != null) __obj.updateDynamic("ParentHandshakeId")(ParentHandshakeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandshakeFilter]
  }
}

