package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceLastAccessedDetailsWithEntitiesResponse extends StObject {
  
  /**
    * An EntityDetailsList object that contains details about when an IAM entity (user or role) used group or policy permissions in an attempt to access the specified Amazon Web Services service.
    */
  var EntityDetailsList: entityDetailsListType
  
  /**
    * An object that contains details about the reason the operation failed.
    */
  var Error: js.UndefOr[ErrorDetails] = js.undefined
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when the generated report job was completed or failed. This field is null if the job is still in progress, as indicated by a job status value of IN_PROGRESS.
    */
  var JobCompletionDate: js.Date
  
  /**
    * The date and time, in ISO 8601 date-time format, when the report job was created.
    */
  var JobCreationDate: js.Date
  
  /**
    * The status of the job.
    */
  var JobStatus: jobStatusType
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
}
object GetServiceLastAccessedDetailsWithEntitiesResponse {
  
  inline def apply(
    EntityDetailsList: entityDetailsListType,
    JobCompletionDate: js.Date,
    JobCreationDate: js.Date,
    JobStatus: jobStatusType
  ): GetServiceLastAccessedDetailsWithEntitiesResponse = {
    val __obj = js.Dynamic.literal(EntityDetailsList = EntityDetailsList.asInstanceOf[js.Any], JobCompletionDate = JobCompletionDate.asInstanceOf[js.Any], JobCreationDate = JobCreationDate.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceLastAccessedDetailsWithEntitiesResponse]
  }
  
  extension [Self <: GetServiceLastAccessedDetailsWithEntitiesResponse](x: Self) {
    
    inline def setEntityDetailsList(value: entityDetailsListType): Self = StObject.set(x, "EntityDetailsList", value.asInstanceOf[js.Any])
    
    inline def setEntityDetailsListVarargs(value: EntityDetails*): Self = StObject.set(x, "EntityDetailsList", js.Array(value*))
    
    inline def setError(value: ErrorDetails): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setJobCompletionDate(value: js.Date): Self = StObject.set(x, "JobCompletionDate", value.asInstanceOf[js.Any])
    
    inline def setJobCreationDate(value: js.Date): Self = StObject.set(x, "JobCreationDate", value.asInstanceOf[js.Any])
    
    inline def setJobStatus(value: jobStatusType): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
