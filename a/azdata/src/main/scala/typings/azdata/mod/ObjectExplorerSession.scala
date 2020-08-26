package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExplorerSession extends js.Object {
  var errorMessage: String = js.native
  var rootNode: NodeInfo = js.native
  var sessionId: String = js.native
  var success: Boolean = js.native
}

object ObjectExplorerSession {
  @scala.inline
  def apply(errorMessage: String, rootNode: NodeInfo, sessionId: String, success: Boolean): ObjectExplorerSession = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerSession]
  }
  @scala.inline
  implicit class ObjectExplorerSessionOps[Self <: ObjectExplorerSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootNode(value: NodeInfo): Self = this.set("rootNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

