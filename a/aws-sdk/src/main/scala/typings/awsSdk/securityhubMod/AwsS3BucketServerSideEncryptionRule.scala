package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsS3BucketServerSideEncryptionRule extends js.Object {
  /**
    * Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT object request doesn't specify any server-side encryption, this default encryption is applied.
    */
  var ApplyServerSideEncryptionByDefault: js.UndefOr[AwsS3BucketServerSideEncryptionByDefault] = js.native
}

object AwsS3BucketServerSideEncryptionRule {
  @scala.inline
  def apply(): AwsS3BucketServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionRule]
  }
  @scala.inline
  implicit class AwsS3BucketServerSideEncryptionRuleOps[Self <: AwsS3BucketServerSideEncryptionRule] (val x: Self) extends AnyVal {
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
    def setApplyServerSideEncryptionByDefault(value: AwsS3BucketServerSideEncryptionByDefault): Self = this.set("ApplyServerSideEncryptionByDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyServerSideEncryptionByDefault: Self = this.set("ApplyServerSideEncryptionByDefault", js.undefined)
  }
  
}

