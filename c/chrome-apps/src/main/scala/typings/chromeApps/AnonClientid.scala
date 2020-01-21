package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientid extends js.Object {
  /** You need to register your app in the Google APIs Console to get the client ID. */
  var client_id: String
  /** Applies to these scopes */
  var scopes: js.Array[String]
}

object AnonClientid {
  @scala.inline
  def apply(client_id: String, scopes: js.Array[String]): AnonClientid = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientid]
  }
}

