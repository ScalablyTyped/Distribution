package typings.azure.mod

import typings.azure.anon.Expiry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedAccessPolicy extends js.Object {
  var AccessPolicy: Expiry
  var Id: js.UndefOr[String] = js.undefined
}

object SharedAccessPolicy {
  @scala.inline
  def apply(AccessPolicy: Expiry, Id: String = null): SharedAccessPolicy = {
    val __obj = js.Dynamic.literal(AccessPolicy = AccessPolicy.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAccessPolicy]
  }
}

