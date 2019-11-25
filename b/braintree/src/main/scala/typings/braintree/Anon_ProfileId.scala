package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProfileId extends js.Object {
  var profileId: js.UndefOr[String] = js.undefined
}

object Anon_ProfileId {
  @scala.inline
  def apply(profileId: String = null): Anon_ProfileId = {
    val __obj = js.Dynamic.literal()
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProfileId]
  }
}

