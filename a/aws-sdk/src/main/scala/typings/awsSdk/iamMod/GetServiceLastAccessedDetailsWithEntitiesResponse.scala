package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceLastAccessedDetailsWithEntitiesResponse extends StObject {
  
  /**
    * An EntityDetailsList object that contains details about when an IAM entity (user or role) used group or policy permissions in an attempt to access the specified AWS service.
    */
  var EntityDetailsList: entityDetailsListType = js.native
  
  /**
    * An object that contains details about the reason the operation failed.
    */
  var Error: js.UndefOr[ErrorDetails] = js.native
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when the generated report job was completed or failed. This field is null if the job is still in progress, as indicated by a job status value of IN_PROGRESS.
    */
  var JobCompletionDate: dateType = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when the report job was created.
    */
  var JobCreationDate: dateType = js.native
  
  /**
    * The status of the job.
    */
  var JobStatus: jobStatusType = js.native
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
}
object GetServiceLastAccessedDetailsWithEntitiesResponse {
  
  @scala.inline
  def apply(
    EntityDetailsList: entityDetailsListType,
    JobCompletionDate: dateType,
    JobCreationDate: dateType,
    JobStatus: jobStatusType
  ): GetServiceLastAccessedDetailsWithEntitiesResponse = {
    val __obj = js.Dynamic.literal(EntityDetailsList = EntityDetailsList.asInstanceOf[js.Any], JobCompletionDate = JobCompletionDate.asInstanceOf[js.Any], JobCreationDate = JobCreationDate.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceLastAccessedDetailsWithEntitiesResponse]
  }
  
  @scala.inline
  implicit class GetServiceLastAccessedDetailsWithEntitiesResponseMutableBuilder[Self <: GetServiceLastAccessedDetailsWithEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityDetailsList(value: entityDetailsListType): Self = StObject.set(x, "EntityDetailsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityDetailsListVarargs(value: EntityDetails*): Self = StObject.set(x, "EntityDetailsList", js.Array(value :_*))
    
    @scala.inline
    def setError(value: ErrorDetails): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    @scala.inline
    def setJobCompletionDate(value: dateType): Self = StObject.set(x, "JobCompletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobCreationDate(value: dateType): Self = StObject.set(x, "JobCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatus(value: jobStatusType): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
