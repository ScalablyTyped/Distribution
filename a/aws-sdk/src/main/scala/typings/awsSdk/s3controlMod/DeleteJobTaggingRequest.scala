package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJobTaggingRequest extends js.Object {
  /**
    * The account ID for the Amazon Web Services account associated with the Amazon S3 batch operations job you want to remove tags from.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The ID for the job whose tags you want to delete.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId = js.native
}

object DeleteJobTaggingRequest {
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId): DeleteJobTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobTaggingRequest]
  }
}

