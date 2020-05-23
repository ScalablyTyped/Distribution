package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityCallbackData extends js.Object {
  var identity_id: String
  var link: String
  var referring_data_parsed: js.UndefOr[js.Object] = js.undefined
  var referring_identity: js.UndefOr[String] = js.undefined
}

object IdentityCallbackData {
  @scala.inline
  def apply(
    identity_id: String,
    link: String,
    referring_data_parsed: js.Object = null,
    referring_identity: String = null
  ): IdentityCallbackData = {
    val __obj = js.Dynamic.literal(identity_id = identity_id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    if (referring_data_parsed != null) __obj.updateDynamic("referring_data_parsed")(referring_data_parsed.asInstanceOf[js.Any])
    if (referring_identity != null) __obj.updateDynamic("referring_identity")(referring_identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityCallbackData]
  }
}

