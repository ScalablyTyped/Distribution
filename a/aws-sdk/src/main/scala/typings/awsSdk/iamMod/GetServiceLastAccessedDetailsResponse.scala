package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceLastAccessedDetailsResponse extends js.Object {
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
    * The type of job. Service jobs return information about when each service was last accessed. Action jobs also include information about when tracked actions within the service were last accessed.
    */
  var JobType: js.UndefOr[AccessAdvisorUsageGranularityType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  /**
    *  A ServiceLastAccessed object that contains details about the most recent attempt to access the service.
    */
  var ServicesLastAccessed: typings.awsSdk.iamMod.ServicesLastAccessed = js.native
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
  implicit class GetServiceLastAccessedDetailsResponseOps[Self <: GetServiceLastAccessedDetailsResponse] (val x: Self) extends AnyVal {
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
    def setJobCompletionDate(value: dateType): Self = this.set("JobCompletionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobCreationDate(value: dateType): Self = this.set("JobCreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobStatus(value: jobStatusType): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setServicesLastAccessedVarargs(value: ServiceLastAccessed*): Self = this.set("ServicesLastAccessed", js.Array(value :_*))
    @scala.inline
    def setServicesLastAccessed(value: ServicesLastAccessed): Self = this.set("ServicesLastAccessed", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorDetails): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    @scala.inline
    def setIsTruncated(value: booleanType): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setJobType(value: AccessAdvisorUsageGranularityType): Self = this.set("JobType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobType: Self = this.set("JobType", js.undefined)
    @scala.inline
    def setMarker(value: responseMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

