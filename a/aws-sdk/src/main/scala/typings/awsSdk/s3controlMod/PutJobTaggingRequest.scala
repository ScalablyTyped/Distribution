package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutJobTaggingRequest extends js.Object {
  /**
    * The account ID for the Amazon Web Services account associated with the Amazon S3 batch operations job you want to replace tags on.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The ID for the job whose tags you want to replace.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId = js.native
  /**
    * The set of tags to associate with the job.
    */
  var Tags: S3TagSet = js.native
}

object PutJobTaggingRequest {
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId, Tags: S3TagSet): PutJobTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutJobTaggingRequest]
  }
}

