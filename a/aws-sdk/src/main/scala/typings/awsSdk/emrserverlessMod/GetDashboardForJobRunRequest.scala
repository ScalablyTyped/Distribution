package typings.awsSdk.emrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDashboardForJobRunRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var applicationId: ApplicationId
  
  /**
    * The ID of the job run.
    */
  var jobRunId: JobRunId
}
object GetDashboardForJobRunRequest {
  
  inline def apply(applicationId: ApplicationId, jobRunId: JobRunId): GetDashboardForJobRunRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], jobRunId = jobRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDashboardForJobRunRequest]
  }
  
  extension [Self <: GetDashboardForJobRunRequest](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setJobRunId(value: JobRunId): Self = StObject.set(x, "jobRunId", value.asInstanceOf[js.Any])
  }
}
