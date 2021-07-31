package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobDocumentRequest extends StObject {
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId
}
object GetJobDocumentRequest {
  
  @scala.inline
  def apply(jobId: JobId): GetJobDocumentRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobDocumentRequest]
  }
  
  @scala.inline
  implicit class GetJobDocumentRequestMutableBuilder[Self <: GetJobDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
