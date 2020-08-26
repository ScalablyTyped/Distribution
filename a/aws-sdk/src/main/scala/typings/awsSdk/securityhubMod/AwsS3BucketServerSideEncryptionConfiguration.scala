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
  def apply(): AwsS3BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionConfiguration]
  }
  @scala.inline
  implicit class AwsS3BucketServerSideEncryptionConfigurationOps[Self <: AwsS3BucketServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: AwsS3BucketServerSideEncryptionRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: AwsS3BucketServerSideEncryptionRules): Self = this.set("Rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
  
}

