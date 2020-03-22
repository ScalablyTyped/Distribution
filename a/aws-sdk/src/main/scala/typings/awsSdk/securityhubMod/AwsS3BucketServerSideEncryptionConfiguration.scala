package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsS3BucketServerSideEncryptionConfiguration extends js.Object {
  /**
    * The encryption rules that are applied to the S3 bucket.
    */
  var Rules: js.UndefOr[AwsS3BucketServerSideEncryptionRules] = js.native
}

object AwsS3BucketServerSideEncryptionConfiguration {
  @scala.inline
  def apply(Rules: AwsS3BucketServerSideEncryptionRules = null): AwsS3BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionConfiguration]
  }
}

