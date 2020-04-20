package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobTaggingRequest extends js.Object {
  /**
    * The account ID for the Amazon Web Services account associated with the Amazon S3 batch operations job you want to retrieve tags for.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The ID for the job whose tags you want to retrieve.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId = js.native
}

object GetJobTaggingRequest {
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId): GetJobTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobTaggingRequest]
  }
}

