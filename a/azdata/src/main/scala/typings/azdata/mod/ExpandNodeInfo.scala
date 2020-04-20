package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandNodeInfo extends js.Object {
  var nodePath: String
  var sessionId: String
}

object ExpandNodeInfo {
  @scala.inline
  def apply(nodePath: String, sessionId: String): ExpandNodeInfo = {
    val __obj = js.Dynamic.literal(nodePath = nodePath.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandNodeInfo]
  }
}

