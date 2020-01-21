package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String = js.native
  /**
    * The state of the jobs to return. You can specify true or false.
    */
  var completed: js.UndefOr[String] = js.native
  /**
    * The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be fewer than the specified limit, but the number of returned jobs never exceeds the limit.
    */
  var limit: js.UndefOr[String] = js.native
  /**
    * An opaque string used for pagination. This value specifies the job at which the listing of jobs should begin. Get the marker value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of results started in a previous List Jobs request.
    */
  var marker: js.UndefOr[String] = js.native
  /**
    * The type of job status to return. You can specify the following values: InProgress, Succeeded, or Failed.
    */
  var statuscode: js.UndefOr[String] = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object ListJobsInput {
  @scala.inline
  def apply(
    accountId: String,
    vaultName: String,
    completed: String = null,
    limit: String = null,
    marker: String = null,
    statuscode: String = null
  ): ListJobsInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (statuscode != null) __obj.updateDynamic("statuscode")(statuscode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsInput]
  }
}

