package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerCloseSessionInfo extends js.Object {
  var sessionId: String
}

object ObjectExplorerCloseSessionInfo {
  @scala.inline
  def apply(sessionId: String): ObjectExplorerCloseSessionInfo = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectExplorerCloseSessionInfo]
  }
}

