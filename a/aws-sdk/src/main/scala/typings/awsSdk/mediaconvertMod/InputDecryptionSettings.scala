package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDecryptionSettings extends js.Object {
  /**
    * Specify the encryption mode that you used to encrypt your input files.
    */
  var DecryptionMode: js.UndefOr[typings.awsSdk.mediaconvertMod.DecryptionMode] = js.native
  /**
    * Warning! Don't provide your encryption key in plaintext. Your job settings could be intercepted, making your encrypted content vulnerable. Specify the encrypted version of the data key that you used to encrypt your content. The data key must be encrypted by AWS Key Management Service (KMS). The key can be 128, 192, or 256 bits.
    */
  var EncryptedDecryptionKey: js.UndefOr[stringMin24Max512PatternAZaZ0902] = js.native
  /**
    * Specify the initialization vector that you used when you encrypted your content before uploading it to Amazon S3. You can use a 16-byte initialization vector with any encryption mode. Or, you can use a 12-byte initialization vector with GCM or CTR. MediaConvert accepts only initialization vectors that are base64-encoded.
    */
  var InitializationVector: js.UndefOr[stringMin16Max24PatternAZaZ0922AZaZ0916] = js.native
  /**
    * Specify the AWS Region for AWS Key Management Service (KMS) that you used to encrypt your data key, if that Region is different from the one you are using for AWS Elemental MediaConvert.
    */
  var KmsKeyRegion: js.UndefOr[stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912] = js.native
}

object InputDecryptionSettings {
  @scala.inline
  def apply(
    DecryptionMode: DecryptionMode = null,
    EncryptedDecryptionKey: stringMin24Max512PatternAZaZ0902 = null,
    InitializationVector: stringMin16Max24PatternAZaZ0922AZaZ0916 = null,
    KmsKeyRegion: stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912 = null
  ): InputDecryptionSettings = {
    val __obj = js.Dynamic.literal()
    if (DecryptionMode != null) __obj.updateDynamic("DecryptionMode")(DecryptionMode.asInstanceOf[js.Any])
    if (EncryptedDecryptionKey != null) __obj.updateDynamic("EncryptedDecryptionKey")(EncryptedDecryptionKey.asInstanceOf[js.Any])
    if (InitializationVector != null) __obj.updateDynamic("InitializationVector")(InitializationVector.asInstanceOf[js.Any])
    if (KmsKeyRegion != null) __obj.updateDynamic("KmsKeyRegion")(KmsKeyRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDecryptionSettings]
  }
}

