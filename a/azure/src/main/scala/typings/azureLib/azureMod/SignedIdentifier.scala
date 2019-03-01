package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedIdentifier extends js.Object {
  var AccessPolicy: SharedAccessPolicy
  var Id: java.lang.String
}

object SignedIdentifier {
  @scala.inline
  def apply(AccessPolicy: SharedAccessPolicy, Id: java.lang.String): SignedIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessPolicy")(AccessPolicy)
    __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[SignedIdentifier]
  }
}

