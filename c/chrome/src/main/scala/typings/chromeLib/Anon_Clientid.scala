package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clientid extends js.Object {
  var client_id: java.lang.String
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Clientid {
  @scala.inline
  def apply(client_id: java.lang.String, scopes: js.Array[java.lang.String] = null): Anon_Clientid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client_id")(client_id)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[Anon_Clientid]
  }
}

