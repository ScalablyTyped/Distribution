package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportKeyMaterialRequest extends js.Object {
  
  /**
    * The encrypted key material to import. The key material must be encrypted with the public wrapping key that GetParametersForImport returned, using the wrapping algorithm that you specified in the same GetParametersForImport request.
    */
  var EncryptedKeyMaterial: CiphertextType = js.native
  
  /**
    * Specifies whether the key material expires. The default is KEY_MATERIAL_EXPIRES, in which case you must include the ValidTo parameter. When this parameter is set to KEY_MATERIAL_DOES_NOT_EXPIRE, you must omit the ValidTo parameter.
    */
  var ExpirationModel: js.UndefOr[ExpirationModelType] = js.native
  
  /**
    * The import token that you received in the response to a previous GetParametersForImport request. It must be from the same response that contained the public key that you used to encrypt the key material.
    */
  var ImportToken: CiphertextType = js.native
  
  /**
    * The identifier of the symmetric CMK that receives the imported key material. The CMK's Origin must be EXTERNAL. This must be the same CMK specified in the KeyID parameter of the corresponding GetParametersForImport request. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType = js.native
  
  /**
    * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. You must omit this parameter when the ExpirationModel parameter is set to KEY_MATERIAL_DOES_NOT_EXPIRE. Otherwise it is required.
    */
  var ValidTo: js.UndefOr[DateType] = js.native
}
object ImportKeyMaterialRequest {
  
  @scala.inline
  def apply(EncryptedKeyMaterial: CiphertextType, ImportToken: CiphertextType, KeyId: KeyIdType): ImportKeyMaterialRequest = {
    val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKeyMaterialRequest]
  }
  
  @scala.inline
  implicit class ImportKeyMaterialRequestOps[Self <: ImportKeyMaterialRequest] (val x: Self) extends AnyVal {
    
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
    def setEncryptedKeyMaterial(value: CiphertextType): Self = this.set("EncryptedKeyMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportToken(value: CiphertextType): Self = this.set("ImportToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationModel(value: ExpirationModelType): Self = this.set("ExpirationModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationModel: Self = this.set("ExpirationModel", js.undefined)
    
    @scala.inline
    def setValidTo(value: DateType): Self = this.set("ValidTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidTo: Self = this.set("ValidTo", js.undefined)
  }
}
