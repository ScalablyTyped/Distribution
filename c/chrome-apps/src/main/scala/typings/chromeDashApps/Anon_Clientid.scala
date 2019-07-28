package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clientid extends js.Object {
  /** You need to register your app in the Google APIs Console to get the client ID. */
  var client_id: String
  /** Applies to these scopes */
  var scopes: js.Array[String]
}

object Anon_Clientid {
  @scala.inline
  def apply(client_id: String, scopes: js.Array[String]): Anon_Clientid = {
    val __obj = js.Dynamic.literal(client_id = client_id, scopes = scopes)
  
    __obj.asInstanceOf[Anon_Clientid]
  }
}

