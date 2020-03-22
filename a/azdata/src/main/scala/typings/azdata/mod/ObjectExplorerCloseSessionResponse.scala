package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerCloseSessionResponse extends js.Object {
  var sessionId: String
  var success: Boolean
}

object ObjectExplorerCloseSessionResponse {
  @scala.inline
  def apply(sessionId: String, success: Boolean): ObjectExplorerCloseSessionResponse = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectExplorerCloseSessionResponse]
  }
}

