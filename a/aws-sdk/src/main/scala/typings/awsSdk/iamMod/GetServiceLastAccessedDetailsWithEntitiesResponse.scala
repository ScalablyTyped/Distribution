package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceLastAccessedDetailsWithEntitiesResponse extends js.Object {
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
  implicit class GetServiceLastAccessedDetailsWithEntitiesResponseOps[Self <: GetServiceLastAccessedDetailsWithEntitiesResponse] (val x: Self) extends AnyVal {
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
    def setEntityDetailsListVarargs(value: EntityDetails*): Self = this.set("EntityDetailsList", js.Array(value :_*))
    @scala.inline
    def setEntityDetailsList(value: entityDetailsListType): Self = this.set("EntityDetailsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobCompletionDate(value: dateType): Self = this.set("JobCompletionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobCreationDate(value: dateType): Self = this.set("JobCreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobStatus(value: jobStatusType): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorDetails): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    @scala.inline
    def setIsTruncated(value: booleanType): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setMarker(value: responseMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

