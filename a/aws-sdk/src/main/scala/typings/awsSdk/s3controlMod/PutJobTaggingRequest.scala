package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutJobTaggingRequest extends js.Object {
  /**
    * The AWS account ID associated with the Amazon S3 Batch Operations job.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The ID for the Amazon S3 Batch Operations job whose tags you want to replace.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId = js.native
  /**
    * The set of tags to associate with the Amazon S3 Batch Operations job.
    */
  var Tags: S3TagSet = js.native
}

object PutJobTaggingRequest {
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId, Tags: S3TagSet): PutJobTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutJobTaggingRequest]
  }
  @scala.inline
  implicit class PutJobTaggingRequestOps[Self <: PutJobTaggingRequest] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: S3Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: S3TagSet): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

