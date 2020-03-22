package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeyPairResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the new key pair you just created.
    */
  var keyPair: js.UndefOr[KeyPair] = js.native
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the time stamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.native
  /**
    * A base64-encoded RSA private key.
    */
  var privateKeyBase64: js.UndefOr[Base64] = js.native
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: js.UndefOr[Base64] = js.native
}

object CreateKeyPairResult {
  @scala.inline
  def apply(
    keyPair: KeyPair = null,
    operation: Operation = null,
    privateKeyBase64: Base64 = null,
    publicKeyBase64: Base64 = null
  ): CreateKeyPairResult = {
    val __obj = js.Dynamic.literal()
    if (keyPair != null) __obj.updateDynamic("keyPair")(keyPair.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (privateKeyBase64 != null) __obj.updateDynamic("privateKeyBase64")(privateKeyBase64.asInstanceOf[js.Any])
    if (publicKeyBase64 != null) __obj.updateDynamic("publicKeyBase64")(publicKeyBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyPairResult]
  }
}

