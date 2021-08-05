package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptingParamDetails extends StObject {
  
  var filePath: String
  
  var scriptCompatibilityOption: String
  
  var targetDatabaseEngineEdition: String
  
  var targetDatabaseEngineType: String
}
object ScriptingParamDetails {
  
  inline def apply(
    filePath: String,
    scriptCompatibilityOption: String,
    targetDatabaseEngineEdition: String,
    targetDatabaseEngineType: String
  ): ScriptingParamDetails = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], scriptCompatibilityOption = scriptCompatibilityOption.asInstanceOf[js.Any], targetDatabaseEngineEdition = targetDatabaseEngineEdition.asInstanceOf[js.Any], targetDatabaseEngineType = targetDatabaseEngineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingParamDetails]
  }
  
  extension [Self <: ScriptingParamDetails](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setScriptCompatibilityOption(value: String): Self = StObject.set(x, "scriptCompatibilityOption", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseEngineEdition(value: String): Self = StObject.set(x, "targetDatabaseEngineEdition", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseEngineType(value: String): Self = StObject.set(x, "targetDatabaseEngineType", value.asInstanceOf[js.Any])
  }
}
