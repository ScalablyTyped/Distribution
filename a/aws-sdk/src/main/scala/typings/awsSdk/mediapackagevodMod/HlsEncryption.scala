package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(SpekeKeyProvider: SpekeKeyProvider): HlsEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsEncryption]
  }
  
  @scala.inline
  implicit class HlsEncryptionOps[Self <: HlsEncryption] (val x: Self) extends AnyVal {
    
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
    def setSpekeKeyProvider(value: SpekeKeyProvider): Self = this.set("SpekeKeyProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstantInitializationVector(value: string): Self = this.set("ConstantInitializationVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstantInitializationVector: Self = this.set("ConstantInitializationVector", js.undefined)
    
    @scala.inline
    def setEncryptionMethod(value: EncryptionMethod): Self = this.set("EncryptionMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionMethod: Self = this.set("EncryptionMethod", js.undefined)
  }
}
