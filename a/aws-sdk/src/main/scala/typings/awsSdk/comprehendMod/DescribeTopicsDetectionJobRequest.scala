package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTopicsDetectionJobRequest extends StObject {
  
  /**
    * The identifier assigned by the user to the detection job.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId
}
object DescribeTopicsDetectionJobRequest {
  
  inline def apply(JobId: JobId): DescribeTopicsDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTopicsDetectionJobRequest]
  }
  
  extension [Self <: DescribeTopicsDetectionJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
