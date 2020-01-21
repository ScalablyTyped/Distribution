package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyPairResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.native
}

object GetKeyPairResult {
  @scala.inline
  def apply(keyPair: KeyPair = null): GetKeyPairResult = {
    val __obj = js.Dynamic.literal()
    if (keyPair != null) __obj.updateDynamic("keyPair")(keyPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyPairResult]
  }
}

