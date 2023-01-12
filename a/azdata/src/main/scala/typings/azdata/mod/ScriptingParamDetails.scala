package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptingParamDetails extends StObject {
  
  var filePath: js.UndefOr[String] = js.undefined
  
  var scriptCompatibilityOption: String
  
  var targetDatabaseEngineEdition: String
  
  var targetDatabaseEngineType: String
}
object ScriptingParamDetails {
  
  inline def apply(
    scriptCompatibilityOption: String,
    targetDatabaseEngineEdition: String,
    targetDatabaseEngineType: String
  ): ScriptingParamDetails = {
    val __obj = js.Dynamic.literal(scriptCompatibilityOption = scriptCompatibilityOption.asInstanceOf[js.Any], targetDatabaseEngineEdition = targetDatabaseEngineEdition.asInstanceOf[js.Any], targetDatabaseEngineType = targetDatabaseEngineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingParamDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptingParamDetails] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setScriptCompatibilityOption(value: String): Self = StObject.set(x, "scriptCompatibilityOption", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseEngineEdition(value: String): Self = StObject.set(x, "targetDatabaseEngineEdition", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseEngineType(value: String): Self = StObject.set(x, "targetDatabaseEngineType", value.asInstanceOf[js.Any])
  }
}
