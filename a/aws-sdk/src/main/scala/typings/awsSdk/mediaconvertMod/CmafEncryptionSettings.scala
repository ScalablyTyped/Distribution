package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CmafEncryptionSettings extends js.Object {
  
  /**
    * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then the Initialization Vector will follow the segment number by default.
    */
  var ConstantInitializationVector: js.UndefOr[stringMin32Max32Pattern09aFAF32] = js.native
  
  /**
    * Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
    */
  var EncryptionMethod: js.UndefOr[CmafEncryptionType] = js.native
  
  /**
    * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization vector in the HLS and DASH manifests.
    */
  var InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest] = js.native
  
  /**
    * If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[SpekeKeyProviderCmaf] = js.native
  
  /**
    * Use these settings to set up encryption with a static key provider.
    */
  var StaticKeyProvider: js.UndefOr[typings.awsSdk.mediaconvertMod.StaticKeyProvider] = js.native
  
  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  var Type: js.UndefOr[CmafKeyProviderType] = js.native
}
object CmafEncryptionSettings {
  
  @scala.inline
  def apply(): CmafEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmafEncryptionSettings]
  }
  
  @scala.inline
  implicit class CmafEncryptionSettingsOps[Self <: CmafEncryptionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConstantInitializationVector(value: stringMin32Max32Pattern09aFAF32): Self = this.set("ConstantInitializationVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstantInitializationVector: Self = this.set("ConstantInitializationVector", js.undefined)
    
    @scala.inline
    def setEncryptionMethod(value: CmafEncryptionType): Self = this.set("EncryptionMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionMethod: Self = this.set("EncryptionMethod", js.undefined)
    
    @scala.inline
    def setInitializationVectorInManifest(value: CmafInitializationVectorInManifest): Self = this.set("InitializationVectorInManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitializationVectorInManifest: Self = this.set("InitializationVectorInManifest", js.undefined)
    
    @scala.inline
    def setSpekeKeyProvider(value: SpekeKeyProviderCmaf): Self = this.set("SpekeKeyProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpekeKeyProvider: Self = this.set("SpekeKeyProvider", js.undefined)
    
    @scala.inline
    def setStaticKeyProvider(value: StaticKeyProvider): Self = this.set("StaticKeyProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticKeyProvider: Self = this.set("StaticKeyProvider", js.undefined)
    
    @scala.inline
    def setType(value: CmafKeyProviderType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
