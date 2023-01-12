package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreInfo extends StObject {
  
  var options: StringDictionary[Any]
  
  var taskExecutionMode: js.UndefOr[TaskExecutionMode] = js.undefined
}
object RestoreInfo {
  
  inline def apply(options: StringDictionary[Any]): RestoreInfo = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreInfo] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionMode(value: TaskExecutionMode): Self = StObject.set(x, "taskExecutionMode", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionModeUndefined: Self = StObject.set(x, "taskExecutionMode", js.undefined)
  }
}
