package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsEncryption extends StObject {
  
  /**
    * A constant initialization vector for encryption (optional).
  When not specified the initialization vector will be periodically rotated.
    */
  var ConstantInitializationVector: js.UndefOr[string] = js.undefined
  
  /**
    * The encryption method to use.
    */
  var EncryptionMethod: js.UndefOr[typings.awsSdk.mediapackageMod.EncryptionMethod] = js.undefined
  
  /**
    * Interval (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[integer] = js.undefined
  
  /**
    * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
    */
  var RepeatExtXKey: js.UndefOr[boolean] = js.undefined
  
  var SpekeKeyProvider: typings.awsSdk.mediapackageMod.SpekeKeyProvider
}
object HlsEncryption {
  
  inline def apply(SpekeKeyProvider: SpekeKeyProvider): HlsEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsEncryption]
  }
  
  extension [Self <: HlsEncryption](x: Self) {
    
    inline def setConstantInitializationVector(value: string): Self = StObject.set(x, "ConstantInitializationVector", value.asInstanceOf[js.Any])
    
    inline def setConstantInitializationVectorUndefined: Self = StObject.set(x, "ConstantInitializationVector", js.undefined)
    
    inline def setEncryptionMethod(value: EncryptionMethod): Self = StObject.set(x, "EncryptionMethod", value.asInstanceOf[js.Any])
    
    inline def setEncryptionMethodUndefined: Self = StObject.set(x, "EncryptionMethod", js.undefined)
    
    inline def setKeyRotationIntervalSeconds(value: integer): Self = StObject.set(x, "KeyRotationIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setKeyRotationIntervalSecondsUndefined: Self = StObject.set(x, "KeyRotationIntervalSeconds", js.undefined)
    
    inline def setRepeatExtXKey(value: boolean): Self = StObject.set(x, "RepeatExtXKey", value.asInstanceOf[js.Any])
    
    inline def setRepeatExtXKeyUndefined: Self = StObject.set(x, "RepeatExtXKey", js.undefined)
    
    inline def setSpekeKeyProvider(value: SpekeKeyProvider): Self = StObject.set(x, "SpekeKeyProvider", value.asInstanceOf[js.Any])
  }
}
