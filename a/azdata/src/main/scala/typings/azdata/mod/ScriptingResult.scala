package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptingResult extends StObject {
  
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
  implicit class ScriptingResultMutableBuilder[Self <: ScriptingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
