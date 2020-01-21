package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePublicKeyResult extends js.Object {
  /**
    * The current version of the update public key result. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the results of updating the public key.
    */
  var PublicKey: js.UndefOr[typings.awsSdk.cloudfrontMod.PublicKey] = js.native
}

object UpdatePublicKeyResult {
  @scala.inline
  def apply(ETag: String = null, PublicKey: PublicKey = null): UpdatePublicKeyResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublicKeyResult]
  }
}

