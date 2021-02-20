package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsEncryption extends StObject {
  
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
  def apply(SpekeKeyProvider: SpekeKeyProvider): HlsEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsEncryption]
  }
  
  @scala.inline
  implicit class HlsEncryptionMutableBuilder[Self <: HlsEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstantInitializationVector(value: string): Self = StObject.set(x, "ConstantInitializationVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstantInitializationVectorUndefined: Self = StObject.set(x, "ConstantInitializationVector", js.undefined)
    
    @scala.inline
    def setEncryptionMethod(value: EncryptionMethod): Self = StObject.set(x, "EncryptionMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionMethodUndefined: Self = StObject.set(x, "EncryptionMethod", js.undefined)
    
    @scala.inline
    def setKeyRotationIntervalSeconds(value: integer): Self = StObject.set(x, "KeyRotationIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyRotationIntervalSecondsUndefined: Self = StObject.set(x, "KeyRotationIntervalSeconds", js.undefined)
    
    @scala.inline
    def setRepeatExtXKey(value: boolean): Self = StObject.set(x, "RepeatExtXKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatExtXKeyUndefined: Self = StObject.set(x, "RepeatExtXKey", js.undefined)
    
    @scala.inline
    def setSpekeKeyProvider(value: SpekeKeyProvider): Self = StObject.set(x, "SpekeKeyProvider", value.asInstanceOf[js.Any])
  }
}
