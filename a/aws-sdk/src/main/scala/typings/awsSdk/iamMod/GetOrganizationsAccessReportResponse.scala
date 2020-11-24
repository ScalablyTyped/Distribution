package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrganizationsAccessReportResponse extends js.Object {
  
  /**
    * An object that contains details about the most recent attempt to access the service.
    */
  var AccessDetails: js.UndefOr[typings.awsSdk.iamMod.AccessDetails] = js.native
  
  var ErrorDetails: js.UndefOr[typings.awsSdk.iamMod.ErrorDetails] = js.native
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when the generated report job was completed or failed. This field is null if the job is still in progress, as indicated by a job status value of IN_PROGRESS.
    */
  var JobCompletionDate: js.UndefOr[dateType] = js.native
  
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
  var Marker: js.UndefOr[markerType] = js.native
  
  /**
    * The number of services that the applicable SCPs allow account principals to access.
    */
  var NumberOfServicesAccessible: js.UndefOr[integerType] = js.native
  
  /**
    * The number of services that account principals are allowed but did not attempt to access.
    */
  var NumberOfServicesNotAccessed: js.UndefOr[integerType] = js.native
}
object GetOrganizationsAccessReportResponse {
  
  @scala.inline
  def apply(JobCreationDate: dateType, JobStatus: jobStatusType): GetOrganizationsAccessReportResponse = {
    val __obj = js.Dynamic.literal(JobCreationDate = JobCreationDate.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationsAccessReportResponse]
  }
  
  @scala.inline
  implicit class GetOrganizationsAccessReportResponseOps[Self <: GetOrganizationsAccessReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobCreationDate(value: dateType): Self = this.set("JobCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatus(value: jobStatusType): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessDetailsVarargs(value: AccessDetail*): Self = this.set("AccessDetails", js.Array(value :_*))
    
    @scala.inline
    def setAccessDetails(value: AccessDetails): Self = this.set("AccessDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessDetails: Self = this.set("AccessDetails", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: ErrorDetails): Self = this.set("ErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("ErrorDetails", js.undefined)
    
    @scala.inline
    def setIsTruncated(value: booleanType): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    
    @scala.inline
    def setJobCompletionDate(value: dateType): Self = this.set("JobCompletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobCompletionDate: Self = this.set("JobCompletionDate", js.undefined)
    
    @scala.inline
    def setMarker(value: markerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setNumberOfServicesAccessible(value: integerType): Self = this.set("NumberOfServicesAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfServicesAccessible: Self = this.set("NumberOfServicesAccessible", js.undefined)
    
    @scala.inline
    def setNumberOfServicesNotAccessed(value: integerType): Self = this.set("NumberOfServicesNotAccessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfServicesNotAccessed: Self = this.set("NumberOfServicesNotAccessed", js.undefined)
  }
}
