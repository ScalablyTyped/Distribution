package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptingResult extends StObject {
  
  var operationId: String
  
  var script: String
}
object ScriptingResult {
  
  inline def apply(operationId: String, script: String): ScriptingResult = {
    val __obj = js.Dynamic.literal(operationId = operationId.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptingResult] (val x: Self) extends AnyVal {
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
