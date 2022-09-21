package typings.awsSdk.healthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFHIRExportJobsRequest extends StObject {
  
  /**
    *  This parameter limits the response to the export job with the specified Data Store ID. 
    */
  var DatastoreId: typings.awsSdk.healthlakeMod.DatastoreId
  
  /**
    *  This parameter limits the response to the export job with the specified job name. 
    */
  var JobName: js.UndefOr[typings.awsSdk.healthlakeMod.JobName] = js.undefined
  
  /**
    *  This parameter limits the response to the export jobs with the specified job status. 
    */
  var JobStatus: js.UndefOr[typings.awsSdk.healthlakeMod.JobStatus] = js.undefined
  
  /**
    *  This parameter limits the number of results returned for a ListFHIRExportJobs to a maximum quantity specified by the user. 
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    *  A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.healthlakeMod.NextToken] = js.undefined
  
  /**
    *  This parameter limits the response to FHIR export jobs submitted after a user specified date. 
    */
  var SubmittedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  This parameter limits the response to FHIR export jobs submitted before a user specified date. 
    */
  var SubmittedBefore: js.UndefOr[js.Date] = js.undefined
}
object ListFHIRExportJobsRequest {
  
  inline def apply(DatastoreId: DatastoreId): ListFHIRExportJobsRequest = {
    val __obj = js.Dynamic.literal(DatastoreId = DatastoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFHIRExportJobsRequest]
  }
  
  extension [Self <: ListFHIRExportJobsRequest](x: Self) {
    
    inline def setDatastoreId(value: DatastoreId): Self = StObject.set(x, "DatastoreId", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubmittedAfter(value: js.Date): Self = StObject.set(x, "SubmittedAfter", value.asInstanceOf[js.Any])
    
    inline def setSubmittedAfterUndefined: Self = StObject.set(x, "SubmittedAfter", js.undefined)
    
    inline def setSubmittedBefore(value: js.Date): Self = StObject.set(x, "SubmittedBefore", value.asInstanceOf[js.Any])
    
    inline def setSubmittedBeforeUndefined: Self = StObject.set(x, "SubmittedBefore", js.undefined)
  }
}
