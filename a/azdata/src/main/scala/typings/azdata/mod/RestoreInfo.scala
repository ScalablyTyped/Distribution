package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreInfo extends js.Object {
  
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
  implicit class RestoreInfoOps[Self <: RestoreInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskExecutionMode(value: TaskExecutionMode): Self = this.set("taskExecutionMode", value.asInstanceOf[js.Any])
  }
}
