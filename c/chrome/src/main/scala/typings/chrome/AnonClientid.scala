package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientid extends js.Object {
  var client_id: String
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonClientid {
  @scala.inline
  def apply(client_id: String, scopes: js.Array[String] = null): AnonClientid = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientid]
  }
}

