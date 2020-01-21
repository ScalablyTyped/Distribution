package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDetails extends js.Object {
  /**
    * The AWS account ID associated with the job.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * Represents other information about a job required for a job worker to complete the job. 
    */
  var data: js.UndefOr[JobData] = js.native
  /**
    * The unique system-generated ID of the job.
    */
  var id: js.UndefOr[JobId] = js.native
}

object JobDetails {
  @scala.inline
  def apply(accountId: AccountId = null, data: JobData = null, id: JobId = null): JobDetails = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDetails]
  }
}

