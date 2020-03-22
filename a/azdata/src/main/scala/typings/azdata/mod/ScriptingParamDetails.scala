package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptingParamDetails extends js.Object {
  var filePath: String
  var scriptCompatibilityOption: String
  var targetDatabaseEngineEdition: String
  var targetDatabaseEngineType: String
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
}

