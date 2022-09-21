package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePackageImportJobResponse extends StObject {
  
  /**
    * The job's ID.
    */
  var JobId: typings.awsSdk.panoramaMod.JobId
}
object CreatePackageImportJobResponse {
  
  inline def apply(JobId: JobId): CreatePackageImportJobResponse = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackageImportJobResponse]
  }
  
  extension [Self <: CreatePackageImportJobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
