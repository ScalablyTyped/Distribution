package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNodeFromTemplateJobResponse extends StObject {
  
  /**
    * The job's ID.
    */
  var JobId: typings.awsSdk.panoramaMod.JobId
}
object CreateNodeFromTemplateJobResponse {
  
  inline def apply(JobId: JobId): CreateNodeFromTemplateJobResponse = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodeFromTemplateJobResponse]
  }
  
  extension [Self <: CreateNodeFromTemplateJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
