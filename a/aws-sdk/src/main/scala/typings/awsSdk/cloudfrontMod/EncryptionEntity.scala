package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionEntity extends js.Object {
  
  /**
    * Field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted. You can provide the full field name, or any beginning characters followed by a wildcard (*). You can't overlap field patterns. For example, you can't have both ABC* and AB*. Note that field patterns are case-sensitive. 
    */
  var FieldPatterns: typings.awsSdk.cloudfrontMod.FieldPatterns = js.native
  
  /**
    * The provider associated with the public key being used for encryption. This value must also be provided with the private key for applications to be able to decrypt data.
    */
  var ProviderId: String = js.native
  
  /**
    * The public key associated with a set of field-level encryption patterns, to be used when encrypting the fields that match the patterns. 
    */
  var PublicKeyId: String = js.native
}
object EncryptionEntity {
  
  @scala.inline
  def apply(FieldPatterns: FieldPatterns, ProviderId: String, PublicKeyId: String): EncryptionEntity = {
    val __obj = js.Dynamic.literal(FieldPatterns = FieldPatterns.asInstanceOf[js.Any], ProviderId = ProviderId.asInstanceOf[js.Any], PublicKeyId = PublicKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionEntity]
  }
  
  @scala.inline
  implicit class EncryptionEntityOps[Self <: EncryptionEntity] (val x: Self) extends AnyVal {
    
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
    def setFieldPatterns(value: FieldPatterns): Self = this.set("FieldPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderId(value: String): Self = this.set("ProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyId(value: String): Self = this.set("PublicKeyId", value.asInstanceOf[js.Any])
  }
}
