package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedIdentifier extends js.Object {
  var AccessPolicy: SharedAccessPolicy
  var Id: String
}

object SignedIdentifier {
  @scala.inline
  def apply(AccessPolicy: SharedAccessPolicy, Id: String): SignedIdentifier = {
    val __obj = js.Dynamic.literal(AccessPolicy = AccessPolicy, Id = Id)
  
    __obj.asInstanceOf[SignedIdentifier]
  }
}

