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
  def apply(ApplyServerSideEncryptionByDefault: AwsS3BucketServerSideEncryptionByDefault = null): AwsS3BucketServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    if (ApplyServerSideEncryptionByDefault != null) __obj.updateDynamic("ApplyServerSideEncryptionByDefault")(ApplyServerSideEncryptionByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionRule]
  }
}

