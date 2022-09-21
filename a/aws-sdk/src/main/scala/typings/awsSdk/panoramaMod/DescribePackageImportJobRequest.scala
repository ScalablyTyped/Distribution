package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackageImportJobRequest extends StObject {
  
  /**
    * The job's ID.
    */
  var JobId: typings.awsSdk.panoramaMod.JobId
}
object DescribePackageImportJobRequest {
  
  inline def apply(JobId: JobId): DescribePackageImportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackageImportJobRequest]
  }
  
  extension [Self <: DescribePackageImportJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
