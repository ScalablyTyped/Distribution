package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceLastAccessedDetailsResponse extends StObject {
  
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
  var JobCompletionDate: dateType
  
  /**
    * The date and time, in ISO 8601 date-time format, when the report job was created.
    */
  var JobCreationDate: dateType
  
  /**
    * The status of the job.
    */
  var JobStatus: jobStatusType
  
  /**
    * The type of job. Service jobs return information about when each service was last accessed. Action jobs also include information about when tracked actions within the service were last accessed.
    */
  var JobType: js.UndefOr[AccessAdvisorUsageGranularityType] = js.undefined
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
  
  /**
    *  A ServiceLastAccessed object that contains details about the most recent attempt to access the service.
    */
  var ServicesLastAccessed: typings.awsSdk.iamMod.ServicesLastAccessed
}
object GetServiceLastAccessedDetailsResponse {
  
  @scala.inline
  def apply(
    JobCompletionDate: dateType,
    JobCreationDate: dateType,
    JobStatus: jobStatusType,
    ServicesLastAccessed: ServicesLastAccessed
  ): GetServiceLastAccessedDetailsResponse = {
    val __obj = js.Dynamic.literal(JobCompletionDate = JobCompletionDate.asInstanceOf[js.Any], JobCreationDate = JobCreationDate.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any], ServicesLastAccessed = ServicesLastAccessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceLastAccessedDetailsResponse]
  }
  
  @scala.inline
  implicit class GetServiceLastAccessedDetailsResponseMutableBuilder[Self <: GetServiceLastAccessedDetailsResponse] (val x: Self) extends AnyVal {
    
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
    def setJobType(value: AccessAdvisorUsageGranularityType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    @scala.inline
    def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setServicesLastAccessed(value: ServicesLastAccessed): Self = StObject.set(x, "ServicesLastAccessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesLastAccessedVarargs(value: ServiceLastAccessed*): Self = StObject.set(x, "ServicesLastAccessed", js.Array(value :_*))
  }
}
