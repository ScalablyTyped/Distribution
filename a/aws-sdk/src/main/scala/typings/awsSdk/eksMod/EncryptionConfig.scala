package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionConfig extends js.Object {
  /**
    * AWS Key Management Service (AWS KMS) customer master key (CMK). Either the ARN or the alias can be used.
    */
  var provider: js.UndefOr[Provider] = js.native
  /**
    * Specifies the resources to be encrypted. The only supported value is "secrets".
    */
  var resources: js.UndefOr[StringList] = js.native
}

object EncryptionConfig {
  @scala.inline
  def apply(provider: Provider = null, resources: StringList = null): EncryptionConfig = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfig]
  }
}

