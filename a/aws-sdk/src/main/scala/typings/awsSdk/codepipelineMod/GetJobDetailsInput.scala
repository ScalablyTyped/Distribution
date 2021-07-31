package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobDetailsInput extends StObject {
  
  /**
    * The unique system-generated ID for the job.
    */
  var jobId: JobId
}
object GetJobDetailsInput {
  
  @scala.inline
  def apply(jobId: JobId): GetJobDetailsInput = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobDetailsInput]
  }
  
  @scala.inline
  implicit class GetJobDetailsInputMutableBuilder[Self <: GetJobDetailsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
