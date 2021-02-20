package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDecryptionSettings extends StObject {
  
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
  def apply(): InputDecryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDecryptionSettings]
  }
  
  @scala.inline
  implicit class InputDecryptionSettingsMutableBuilder[Self <: InputDecryptionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecryptionMode(value: DecryptionMode): Self = StObject.set(x, "DecryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecryptionModeUndefined: Self = StObject.set(x, "DecryptionMode", js.undefined)
    
    @scala.inline
    def setEncryptedDecryptionKey(value: stringMin24Max512PatternAZaZ0902): Self = StObject.set(x, "EncryptedDecryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedDecryptionKeyUndefined: Self = StObject.set(x, "EncryptedDecryptionKey", js.undefined)
    
    @scala.inline
    def setInitializationVector(value: stringMin16Max24PatternAZaZ0922AZaZ0916): Self = StObject.set(x, "InitializationVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializationVectorUndefined: Self = StObject.set(x, "InitializationVector", js.undefined)
    
    @scala.inline
    def setKmsKeyRegion(value: stringMin9Max19PatternAZ26EastWestCentralNorthSouthEastWest1912): Self = StObject.set(x, "KmsKeyRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyRegionUndefined: Self = StObject.set(x, "KmsKeyRegion", js.undefined)
  }
}
