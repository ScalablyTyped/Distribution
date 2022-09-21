package typings.awsSdk.healthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFHIRImportJobRequest extends StObject {
  
  /**
    * The AWS-generated ID of the Data Store.
    */
  var DatastoreId: typings.awsSdk.healthlakeMod.DatastoreId
  
  /**
    * The AWS-generated job ID.
    */
  var JobId: typings.awsSdk.healthlakeMod.JobId
}
object DescribeFHIRImportJobRequest {
  
  inline def apply(DatastoreId: DatastoreId, JobId: JobId): DescribeFHIRImportJobRequest = {
    val __obj = js.Dynamic.literal(DatastoreId = DatastoreId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFHIRImportJobRequest]
  }
  
  extension [Self <: DescribeFHIRImportJobRequest](x: Self) {
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
