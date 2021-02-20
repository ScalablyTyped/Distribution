package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTaskStatus extends StObject {
  
  /**
    * The status code of the export task.
    */
  var code: js.UndefOr[ExportTaskStatusCode] = js.native
  
  /**
    * The status message related to the status code.
    */
  var message: js.UndefOr[ExportTaskStatusMessage] = js.native
}
object ExportTaskStatus {
  
  @scala.inline
  def apply(): ExportTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTaskStatus]
  }
  
  @scala.inline
  implicit class ExportTaskStatusMutableBuilder[Self <: ExportTaskStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ExportTaskStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: ExportTaskStatusMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
