package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptingResult extends js.Object {
  var operationId: String = js.native
  var script: String = js.native
}

object ScriptingResult {
  @scala.inline
  def apply(operationId: String, script: String): ScriptingResult = {
    val __obj = js.Dynamic.literal(operationId = operationId.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingResult]
  }
  @scala.inline
  implicit class ScriptingResultOps[Self <: ScriptingResult] (val x: Self) extends AnyVal {
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
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
  }
  
}

