package typings.awsSdk.mediapackagevodMod

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
  var EncryptionMethod: js.UndefOr[typings.awsSdk.mediapackagevodMod.EncryptionMethod] = js.native
  var SpekeKeyProvider: typings.awsSdk.mediapackagevodMod.SpekeKeyProvider = js.native
}

object HlsEncryption {
  @scala.inline
  def apply(
    SpekeKeyProvider: SpekeKeyProvider,
    ConstantInitializationVector: string = null,
    EncryptionMethod: EncryptionMethod = null
  ): HlsEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    if (ConstantInitializationVector != null) __obj.updateDynamic("ConstantInitializationVector")(ConstantInitializationVector.asInstanceOf[js.Any])
    if (EncryptionMethod != null) __obj.updateDynamic("EncryptionMethod")(EncryptionMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsEncryption]
  }
}

