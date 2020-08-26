package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptingParamDetails extends js.Object {
  var filePath: String = js.native
  var scriptCompatibilityOption: String = js.native
  var targetDatabaseEngineEdition: String = js.native
  var targetDatabaseEngineType: String = js.native
}

object ScriptingParamDetails {
  @scala.inline
  def apply(
    filePath: String,
    scriptCompatibilityOption: String,
    targetDatabaseEngineEdition: String,
    targetDatabaseEngineType: String
  ): ScriptingParamDetails = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], scriptCompatibilityOption = scriptCompatibilityOption.asInstanceOf[js.Any], targetDatabaseEngineEdition = targetDatabaseEngineEdition.asInstanceOf[js.Any], targetDatabaseEngineType = targetDatabaseEngineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingParamDetails]
  }
  @scala.inline
  implicit class ScriptingParamDetailsOps[Self <: ScriptingParamDetails] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptCompatibilityOption(value: String): Self = this.set("scriptCompatibilityOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDatabaseEngineEdition(value: String): Self = this.set("targetDatabaseEngineEdition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDatabaseEngineType(value: String): Self = this.set("targetDatabaseEngineType", value.asInstanceOf[js.Any])
  }
  
}

