package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsContentProtection extends StObject {
  
  /**
    * If Elastic Transcoder is generating your key for you, you must leave this field blank. The series of random bits created by a random bit generator, unique for every encryption operation, that you want Elastic Transcoder to use to encrypt your output files. The initialization vector must be base64-encoded, and it must be exactly 16 bytes before being base64-encoded.
    */
  var InitializationVector: js.UndefOr[ZeroTo255String] = js.native
  
  /**
    * If you want Elastic Transcoder to generate a key for you, leave this field blank. If you choose to supply your own key, you must encrypt the key by using AWS KMS. The key must be base64-encoded, and it must be one of the following bit lengths before being base64-encoded:  128, 192, or 256. 
    */
  var Key: js.UndefOr[Base64EncodedString] = js.native
  
  /**
    * If Elastic Transcoder is generating your key for you, you must leave this field blank. The MD5 digest of the key that you want Elastic Transcoder to use to encrypt your output file, and that you want Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes before being base64- encoded.
    */
  var KeyMd5: js.UndefOr[Base64EncodedString] = js.native
  
  /**
    * Specify whether you want Elastic Transcoder to write your HLS license key to an Amazon S3 bucket. If you choose WithVariantPlaylists, LicenseAcquisitionUrl must be left blank and Elastic Transcoder writes your data key into the same bucket as the associated playlist.
    */
  var KeyStoragePolicy: js.UndefOr[typings.awsSdk.elastictranscoderMod.KeyStoragePolicy] = js.native
  
  /**
    * The location of the license key required to decrypt your HLS playlist. The URL must be an absolute path, and is referenced in the URI attribute of the EXT-X-KEY metadata tag in the playlist file.
    */
  var LicenseAcquisitionUrl: js.UndefOr[ZeroTo512String] = js.native
  
  /**
    * The content protection method for your output. The only valid value is: aes-128. This value is written into the method attribute of the EXT-X-KEY metadata tag in the output playlist.
    */
  var Method: js.UndefOr[HlsContentProtectionMethod] = js.native
}
object HlsContentProtection {
  
  @scala.inline
  def apply(): HlsContentProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsContentProtection]
  }
  
  @scala.inline
  implicit class HlsContentProtectionMutableBuilder[Self <: HlsContentProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitializationVector(value: ZeroTo255String): Self = StObject.set(x, "InitializationVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializationVectorUndefined: Self = StObject.set(x, "InitializationVector", js.undefined)
    
    @scala.inline
    def setKey(value: Base64EncodedString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMd5(value: Base64EncodedString): Self = StObject.set(x, "KeyMd5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMd5Undefined: Self = StObject.set(x, "KeyMd5", js.undefined)
    
    @scala.inline
    def setKeyStoragePolicy(value: KeyStoragePolicy): Self = StObject.set(x, "KeyStoragePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyStoragePolicyUndefined: Self = StObject.set(x, "KeyStoragePolicy", js.undefined)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setLicenseAcquisitionUrl(value: ZeroTo512String): Self = StObject.set(x, "LicenseAcquisitionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseAcquisitionUrlUndefined: Self = StObject.set(x, "LicenseAcquisitionUrl", js.undefined)
    
    @scala.inline
    def setMethod(value: HlsContentProtectionMethod): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "Method", js.undefined)
  }
}
