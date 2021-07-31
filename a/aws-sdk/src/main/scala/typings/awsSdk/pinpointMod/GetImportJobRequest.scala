package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportJobRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the job.
    */
  var JobId: string
}
object GetImportJobRequest {
  
  @scala.inline
  def apply(ApplicationId: string, JobId: string): GetImportJobRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobRequest]
  }
  
  @scala.inline
  implicit class GetImportJobRequestMutableBuilder[Self <: GetImportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: string): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
