package typings.azure.azureMod

import typings.azure.Anon_Expiry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedAccessPolicy extends js.Object {
  var AccessPolicy: Anon_Expiry
  var Id: js.UndefOr[String] = js.undefined
}

object SharedAccessPolicy {
  @scala.inline
  def apply(AccessPolicy: Anon_Expiry, Id: String = null): SharedAccessPolicy = {
    val __obj = js.Dynamic.literal(AccessPolicy = AccessPolicy.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAccessPolicy]
  }
}

