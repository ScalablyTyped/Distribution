package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptingParamDetails extends StObject {
  
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
  implicit class ScriptingParamDetailsMutableBuilder[Self <: ScriptingParamDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptCompatibilityOption(value: String): Self = StObject.set(x, "scriptCompatibilityOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDatabaseEngineEdition(value: String): Self = StObject.set(x, "targetDatabaseEngineEdition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDatabaseEngineType(value: String): Self = StObject.set(x, "targetDatabaseEngineType", value.asInstanceOf[js.Any])
  }
}
