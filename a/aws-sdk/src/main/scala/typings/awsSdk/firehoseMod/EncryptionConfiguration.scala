package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionConfiguration extends js.Object {
  /**
    * The encryption key.
    */
  var KMSEncryptionConfig: js.UndefOr[typings.awsSdk.firehoseMod.KMSEncryptionConfig] = js.native
  /**
    * Specifically override existing encryption information to ensure that no encryption is used.
    */
  var NoEncryptionConfig: js.UndefOr[typings.awsSdk.firehoseMod.NoEncryptionConfig] = js.native
}

object EncryptionConfiguration {
  @scala.inline
  def apply(KMSEncryptionConfig: KMSEncryptionConfig = null, NoEncryptionConfig: NoEncryptionConfig = null): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (KMSEncryptionConfig != null) __obj.updateDynamic("KMSEncryptionConfig")(KMSEncryptionConfig.asInstanceOf[js.Any])
    if (NoEncryptionConfig != null) __obj.updateDynamic("NoEncryptionConfig")(NoEncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfiguration]
  }
}

