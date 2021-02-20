package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreInfo extends StObject {
  
  var options: StringDictionary[js.Any] = js.native
  
  var taskExecutionMode: TaskExecutionMode = js.native
}
object RestoreInfo {
  
  @scala.inline
  def apply(options: StringDictionary[js.Any], taskExecutionMode: TaskExecutionMode): RestoreInfo = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], taskExecutionMode = taskExecutionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreInfo]
  }
  
  @scala.inline
  implicit class RestoreInfoMutableBuilder[Self <: RestoreInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskExecutionMode(value: TaskExecutionMode): Self = StObject.set(x, "taskExecutionMode", value.asInstanceOf[js.Any])
  }
}
