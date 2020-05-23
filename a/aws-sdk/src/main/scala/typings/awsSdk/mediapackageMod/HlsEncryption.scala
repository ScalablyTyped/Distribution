package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsEncryption extends js.Object {
  /**
    * A constant initialization vector for encryption (optional).
  When not specified the initialization vector will be periodically rotated.
    */
  var ConstantInitializationVector: js.UndefOr[string] = js.native
  /**
    * The encryption method to use.
    */
  var EncryptionMethod: js.UndefOr[typings.awsSdk.mediapackageMod.EncryptionMethod] = js.native
  /**
    * Interval (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[integer] = js.native
  /**
    * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
    */
  var RepeatExtXKey: js.UndefOr[boolean] = js.native
  var SpekeKeyProvider: typings.awsSdk.mediapackageMod.SpekeKeyProvider = js.native
}

object HlsEncryption {
  @scala.inline
  def apply(
    SpekeKeyProvider: SpekeKeyProvider,
    ConstantInitializationVector: string = null,
    EncryptionMethod: EncryptionMethod = null,
    KeyRotationIntervalSeconds: js.UndefOr[integer] = js.undefined,
    RepeatExtXKey: js.UndefOr[boolean] = js.undefined
  ): HlsEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    if (ConstantInitializationVector != null) __obj.updateDynamic("ConstantInitializationVector")(ConstantInitializationVector.asInstanceOf[js.Any])
    if (EncryptionMethod != null) __obj.updateDynamic("EncryptionMethod")(EncryptionMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(KeyRotationIntervalSeconds)) __obj.updateDynamic("KeyRotationIntervalSeconds")(KeyRotationIntervalSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RepeatExtXKey)) __obj.updateDynamic("RepeatExtXKey")(RepeatExtXKey.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsEncryption]
  }
}

