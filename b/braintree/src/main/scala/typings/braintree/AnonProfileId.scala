package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProfileId extends js.Object {
  var profileId: js.UndefOr[String] = js.undefined
}

object AnonProfileId {
  @scala.inline
  def apply(profileId: String = null): AnonProfileId = {
    val __obj = js.Dynamic.literal()
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProfileId]
  }
}

