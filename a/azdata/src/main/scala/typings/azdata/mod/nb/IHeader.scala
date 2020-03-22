package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeader extends js.Object {
  var msg_id: String
  var msg_type: String
  var session: String
  var username: String
  var version: String
}

object IHeader {
  @scala.inline
  def apply(msg_id: String, msg_type: String, session: String, username: String, version: String): IHeader = {
    val __obj = js.Dynamic.literal(msg_id = msg_id.asInstanceOf[js.Any], msg_type = msg_type.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IHeader]
  }
}

