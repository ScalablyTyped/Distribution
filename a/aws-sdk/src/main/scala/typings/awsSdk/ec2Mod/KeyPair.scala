package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPair extends js.Object {
  /**
    * The SHA-1 digest of the DER encoded private key.
    */
  var KeyFingerprint: js.UndefOr[String] = js.native
  /**
    * An unencrypted PEM encoded RSA private key.
    */
  var KeyMaterial: js.UndefOr[SensitiveUserData] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  /**
    * The ID of the key pair.
    */
  var KeyPairId: js.UndefOr[String] = js.native
  /**
    * Any tags applied to the key pair.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object KeyPair {
  @scala.inline
  def apply(
    KeyFingerprint: String = null,
    KeyMaterial: SensitiveUserData = null,
    KeyName: String = null,
    KeyPairId: String = null,
    Tags: TagList = null
  ): KeyPair = {
    val __obj = js.Dynamic.literal()
    if (KeyFingerprint != null) __obj.updateDynamic("KeyFingerprint")(KeyFingerprint.asInstanceOf[js.Any])
    if (KeyMaterial != null) __obj.updateDynamic("KeyMaterial")(KeyMaterial.asInstanceOf[js.Any])
    if (KeyName != null) __obj.updateDynamic("KeyName")(KeyName.asInstanceOf[js.Any])
    if (KeyPairId != null) __obj.updateDynamic("KeyPairId")(KeyPairId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPair]
  }
}

