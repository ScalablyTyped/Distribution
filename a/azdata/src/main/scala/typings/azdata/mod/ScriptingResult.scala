package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptingResult extends js.Object {
  var operationId: String
  var script: String
}

object ScriptingResult {
  @scala.inline
  def apply(operationId: String, script: String): ScriptingResult = {
    val __obj = js.Dynamic.literal(operationId = operationId.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScriptingResult]
  }
}

