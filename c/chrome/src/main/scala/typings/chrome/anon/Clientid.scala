package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clientid extends js.Object {
  var client_id: String
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object Clientid {
  @scala.inline
  def apply(client_id: String, scopes: js.Array[String] = null): Clientid = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clientid]
  }
}

