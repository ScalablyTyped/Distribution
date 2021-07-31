package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportKeyMaterialRequest extends StObject {
  
  /**
    * The encrypted key material to import. The key material must be encrypted with the public wrapping key that GetParametersForImport returned, using the wrapping algorithm that you specified in the same GetParametersForImport request.
    */
  var EncryptedKeyMaterial: CiphertextType
  
  /**
    * Specifies whether the key material expires. The default is KEY_MATERIAL_EXPIRES, in which case you must include the ValidTo parameter. When this parameter is set to KEY_MATERIAL_DOES_NOT_EXPIRE, you must omit the ValidTo parameter.
    */
  var ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined
  
  /**
    * The import token that you received in the response to a previous GetParametersForImport request. It must be from the same response that contained the public key that you used to encrypt the key material.
    */
  var ImportToken: CiphertextType
  
  /**
    * The identifier of the symmetric CMK that receives the imported key material. The CMK's Origin must be EXTERNAL. This must be the same CMK specified in the KeyID parameter of the corresponding GetParametersForImport request. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  
  /**
    * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. You must omit this parameter when the ExpirationModel parameter is set to KEY_MATERIAL_DOES_NOT_EXPIRE. Otherwise it is required.
    */
  var ValidTo: js.UndefOr[DateType] = js.undefined
}
object ImportKeyMaterialRequest {
  
  @scala.inline
  def apply(EncryptedKeyMaterial: CiphertextType, ImportToken: CiphertextType, KeyId: KeyIdType): ImportKeyMaterialRequest = {
    val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKeyMaterialRequest]
  }
  
  @scala.inline
  implicit class ImportKeyMaterialRequestMutableBuilder[Self <: ImportKeyMaterialRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptedKeyMaterial(value: CiphertextType): Self = StObject.set(x, "EncryptedKeyMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationModel(value: ExpirationModelType): Self = StObject.set(x, "ExpirationModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationModelUndefined: Self = StObject.set(x, "ExpirationModel", js.undefined)
    
    @scala.inline
    def setImportToken(value: CiphertextType): Self = StObject.set(x, "ImportToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidTo(value: DateType): Self = StObject.set(x, "ValidTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidToUndefined: Self = StObject.set(x, "ValidTo", js.undefined)
  }
}
