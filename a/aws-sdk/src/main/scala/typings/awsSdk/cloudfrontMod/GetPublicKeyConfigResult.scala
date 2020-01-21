package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicKeyConfigResult extends js.Object {
  /**
    * The current version of the public key configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the result for the public key configuration.
    */
  var PublicKeyConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.PublicKeyConfig] = js.native
}

object GetPublicKeyConfigResult {
  @scala.inline
  def apply(ETag: String = null, PublicKeyConfig: PublicKeyConfig = null): GetPublicKeyConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (PublicKeyConfig != null) __obj.updateDynamic("PublicKeyConfig")(PublicKeyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicKeyConfigResult]
  }
}

