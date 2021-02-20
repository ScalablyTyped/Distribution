package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLoginResponse extends StObject {
  
  var result: Boolean = js.native
  
  var taskId: Double = js.native
}
object CreateLoginResponse {
  
  @scala.inline
  def apply(result: Boolean, taskId: Double): CreateLoginResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoginResponse]
  }
  
  @scala.inline
  implicit class CreateLoginResponseMutableBuilder[Self <: CreateLoginResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: Double): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
