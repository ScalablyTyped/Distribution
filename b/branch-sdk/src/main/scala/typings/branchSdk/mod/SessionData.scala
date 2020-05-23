package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionData extends js.Object {
  @JSName("~referring_link")
  var Tildereferring_link: js.UndefOr[String] = js.undefined
  var has_app: Boolean
  var identity: String
  var referring_identity: js.UndefOr[String] = js.undefined
}

object SessionData {
  @scala.inline
  def apply(
    has_app: Boolean,
    identity: String,
    Tildereferring_link: String = null,
    referring_identity: String = null
  ): SessionData = {
    val __obj = js.Dynamic.literal(has_app = has_app.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
    if (Tildereferring_link != null) __obj.updateDynamic("~referring_link")(Tildereferring_link.asInstanceOf[js.Any])
    if (referring_identity != null) __obj.updateDynamic("referring_identity")(referring_identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionData]
  }
}

