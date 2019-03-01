package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clientid extends js.Object {
  /** You need to register your app in the Google APIs Console to get the client ID. */
  var client_id: java.lang.String
  /** Applies to these scopes */
  var scopes: js.Array[java.lang.String]
}

object Anon_Clientid {
  @scala.inline
  def apply(client_id: java.lang.String, scopes: js.Array[java.lang.String]): Anon_Clientid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client_id")(client_id)
    __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[Anon_Clientid]
  }
}

