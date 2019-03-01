package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedAccessPolicy extends js.Object {
  var AccessPolicy: azureLib.Anon_Expiry
  var Id: js.UndefOr[java.lang.String] = js.undefined
}

object SharedAccessPolicy {
  @scala.inline
  def apply(AccessPolicy: azureLib.Anon_Expiry, Id: java.lang.String = null): SharedAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessPolicy")(AccessPolicy)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[SharedAccessPolicy]
  }
}

