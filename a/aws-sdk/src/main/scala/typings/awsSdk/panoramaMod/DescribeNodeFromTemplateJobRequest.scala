package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNodeFromTemplateJobRequest extends StObject {
  
  /**
    * The job's ID.
    */
  var JobId: typings.awsSdk.panoramaMod.JobId
}
object DescribeNodeFromTemplateJobRequest {
  
  inline def apply(JobId: JobId): DescribeNodeFromTemplateJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeFromTemplateJobRequest]
  }
  
  extension [Self <: DescribeNodeFromTemplateJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
