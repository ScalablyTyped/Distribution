package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartImportTaskResponse extends StObject {
  
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
  implicit class StartImportTaskResponseMutableBuilder[Self <: StartImportTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTask(value: ImportTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
