package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsElasticsearchDomainEncryptionAtRestOptions extends js.Object {
  /**
    * Whether encryption at rest is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * The KMS key ID. Takes the form 1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.native
}

object AwsElasticsearchDomainEncryptionAtRestOptions {
  @scala.inline
  def apply(): AwsElasticsearchDomainEncryptionAtRestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainEncryptionAtRestOptions]
  }
  @scala.inline
  implicit class AwsElasticsearchDomainEncryptionAtRestOptionsOps[Self <: AwsElasticsearchDomainEncryptionAtRestOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
  }
  
}

