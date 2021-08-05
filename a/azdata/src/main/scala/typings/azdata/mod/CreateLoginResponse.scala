package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoginResponse extends StObject {
  
  var result: Boolean
  
  var taskId: Double
}
object CreateLoginResponse {
  
  inline def apply(result: Boolean, taskId: Double): CreateLoginResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoginResponse]
  }
  
  extension [Self <: CreateLoginResponse](x: Self) {
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: Double): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
