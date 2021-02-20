package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobExecutionResponse extends StObject {
  
  /**
    * A JobExecutionState object.
    */
  var executionState: js.UndefOr[JobExecutionState] = js.native
  
  /**
    * The contents of the Job Documents.
    */
  var jobDocument: js.UndefOr[JobDocument] = js.native
}
object UpdateJobExecutionResponse {
  
  @scala.inline
  def apply(): UpdateJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobExecutionResponse]
  }
  
  @scala.inline
  implicit class UpdateJobExecutionResponseMutableBuilder[Self <: UpdateJobExecutionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionState(value: JobExecutionState): Self = StObject.set(x, "executionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStateUndefined: Self = StObject.set(x, "executionState", js.undefined)
    
    @scala.inline
    def setJobDocument(value: JobDocument): Self = StObject.set(x, "jobDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDocumentUndefined: Self = StObject.set(x, "jobDocument", js.undefined)
  }
}
