package typings.azure.mod

import typings.azure.AnonExpiry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedAccessPolicy extends js.Object {
  var AccessPolicy: AnonExpiry
  var Id: js.UndefOr[String] = js.undefined
}

object SharedAccessPolicy {
  @scala.inline
  def apply(AccessPolicy: AnonExpiry, Id: String = null): SharedAccessPolicy = {
    val __obj = js.Dynamic.literal(AccessPolicy = AccessPolicy.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAccessPolicy]
  }
}

