package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExplorerCloseSessionInfo extends js.Object {
  var sessionId: String = js.native
}

object ObjectExplorerCloseSessionInfo {
  @scala.inline
  def apply(sessionId: String): ObjectExplorerCloseSessionInfo = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerCloseSessionInfo]
  }
  @scala.inline
  implicit class ObjectExplorerCloseSessionInfoOps[Self <: ObjectExplorerCloseSessionInfo] (val x: Self) extends AnyVal {
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
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
  
}

