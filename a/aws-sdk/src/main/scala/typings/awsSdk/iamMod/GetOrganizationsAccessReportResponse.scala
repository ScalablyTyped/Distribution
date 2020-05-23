package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    JobCreationDate: dateType,
    JobStatus: jobStatusType,
    AccessDetails: AccessDetails = null,
    ErrorDetails: ErrorDetails = null,
    IsTruncated: js.UndefOr[booleanType] = js.undefined,
    JobCompletionDate: dateType = null,
    Marker: markerType = null,
    NumberOfServicesAccessible: js.UndefOr[integerType] = js.undefined,
    NumberOfServicesNotAccessed: js.UndefOr[integerType] = js.undefined
  ): GetOrganizationsAccessReportResponse = {
    val __obj = js.Dynamic.literal(JobCreationDate = JobCreationDate.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any])
    if (AccessDetails != null) __obj.updateDynamic("AccessDetails")(AccessDetails.asInstanceOf[js.Any])
    if (ErrorDetails != null) __obj.updateDynamic("ErrorDetails")(ErrorDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.get.asInstanceOf[js.Any])
    if (JobCompletionDate != null) __obj.updateDynamic("JobCompletionDate")(JobCompletionDate.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfServicesAccessible)) __obj.updateDynamic("NumberOfServicesAccessible")(NumberOfServicesAccessible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfServicesNotAccessed)) __obj.updateDynamic("NumberOfServicesNotAccessed")(NumberOfServicesNotAccessed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationsAccessReportResponse]
  }
}

