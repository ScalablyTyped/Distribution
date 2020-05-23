package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsElasticsearchDomainNodeToNodeEncryptionOptions extends js.Object {
  /**
    * Whether node-to-node encryption is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object AwsElasticsearchDomainNodeToNodeEncryptionOptions {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined): AwsElasticsearchDomainNodeToNodeEncryptionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsElasticsearchDomainNodeToNodeEncryptionOptions]
  }
}

