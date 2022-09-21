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
    * The identifier of the symmetric encryption KMS key that receives the imported key material. This must be the same KMS key specified in the KeyID parameter of the corresponding GetParametersForImport request. The Origin of the KMS key must be EXTERNAL. You cannot perform this operation on an asymmetric KMS key, an HMAC KMS key, a KMS key in a custom key store, or on a KMS key in a different Amazon Web Services account Specify the key ID or key ARN of the KMS key. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  
  /**
    * The time at which the imported key material expires. When the key material expires, KMS deletes the key material and the KMS key becomes unusable. You must omit this parameter when the ExpirationModel parameter is set to KEY_MATERIAL_DOES_NOT_EXPIRE. Otherwise it is required.
    */
  var ValidTo: js.UndefOr[js.Date] = js.undefined
}
object ImportKeyMaterialRequest {
  
  inline def apply(EncryptedKeyMaterial: CiphertextType, ImportToken: CiphertextType, KeyId: KeyIdType): ImportKeyMaterialRequest = {
    val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKeyMaterialRequest]
  }
  
  extension [Self <: ImportKeyMaterialRequest](x: Self) {
    
    inline def setEncryptedKeyMaterial(value: CiphertextType): Self = StObject.set(x, "EncryptedKeyMaterial", value.asInstanceOf[js.Any])
    
    inline def setExpirationModel(value: ExpirationModelType): Self = StObject.set(x, "ExpirationModel", value.asInstanceOf[js.Any])
    
    inline def setExpirationModelUndefined: Self = StObject.set(x, "ExpirationModel", js.undefined)
    
    inline def setImportToken(value: CiphertextType): Self = StObject.set(x, "ImportToken", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setValidTo(value: js.Date): Self = StObject.set(x, "ValidTo", value.asInstanceOf[js.Any])
    
    inline def setValidToUndefined: Self = StObject.set(x, "ValidTo", js.undefined)
  }
}
