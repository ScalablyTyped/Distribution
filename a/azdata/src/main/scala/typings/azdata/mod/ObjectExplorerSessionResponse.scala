package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerSessionResponse extends js.Object {
  var sessionId: String
}

object ObjectExplorerSessionResponse {
  @scala.inline
  def apply(sessionId: String): ObjectExplorerSessionResponse = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectExplorerSessionResponse]
  }
}

