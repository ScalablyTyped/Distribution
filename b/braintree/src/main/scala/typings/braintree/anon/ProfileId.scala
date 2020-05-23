package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileId extends js.Object {
  var profileId: js.UndefOr[String] = js.undefined
}

object ProfileId {
  @scala.inline
  def apply(profileId: String = null): ProfileId = {
    val __obj = js.Dynamic.literal()
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileId]
  }
}

