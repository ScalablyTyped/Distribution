package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartImportTaskResponse extends js.Object {
  
  /**
    * An array of information related to the import task request including status information, times, IDs, the Amazon S3 Object URL for the import file, and more. 
    */
  var task: js.UndefOr[ImportTask] = js.native
}
object StartImportTaskResponse {
  
  @scala.inline
  def apply(): StartImportTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImportTaskResponse]
  }
  
  @scala.inline
  implicit class StartImportTaskResponseOps[Self <: StartImportTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTask(value: ImportTask): Self = this.set("task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTask: Self = this.set("task", js.undefined)
  }
}
