package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEncryptionConfigResult extends js.Object {
  /**
    * The encryption configuration document.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.xrayMod.EncryptionConfig] = js.native
}

object GetEncryptionConfigResult {
  @scala.inline
  def apply(EncryptionConfig: EncryptionConfig = null): GetEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEncryptionConfigResult]
  }
}

