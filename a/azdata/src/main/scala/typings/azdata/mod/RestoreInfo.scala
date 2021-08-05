package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreInfo extends StObject {
  
  var options: StringDictionary[js.Any]
  
  var taskExecutionMode: TaskExecutionMode
}
object RestoreInfo {
  
  inline def apply(options: StringDictionary[js.Any], taskExecutionMode: TaskExecutionMode): RestoreInfo = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], taskExecutionMode = taskExecutionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreInfo]
  }
  
  extension [Self <: RestoreInfo](x: Self) {
    
    inline def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionMode(value: TaskExecutionMode): Self = StObject.set(x, "taskExecutionMode", value.asInstanceOf[js.Any])
  }
}
