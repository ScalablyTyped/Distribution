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
  def apply(Enabled: js.UndefOr[scala.Boolean] = js.undefined, KmsKeyId: NonEmptyString = null): AwsElasticsearchDomainEncryptionAtRestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsElasticsearchDomainEncryptionAtRestOptions]
  }
}

