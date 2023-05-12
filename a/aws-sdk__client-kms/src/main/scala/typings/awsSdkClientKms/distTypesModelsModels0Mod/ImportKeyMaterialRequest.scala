package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportKeyMaterialRequest extends StObject {
  
  /**
    * <p>The encrypted key material to import. The key material must be encrypted with the public
    *       wrapping key that <a>GetParametersForImport</a> returned, using the wrapping
    *       algorithm that you specified in the same <code>GetParametersForImport</code> request.</p>
    */
  var EncryptedKeyMaterial: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>Specifies whether the key material expires. The default is
    *         <code>KEY_MATERIAL_EXPIRES</code>.</p>
    *          <p>When the value of <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, you
    *       must specify a value for the <code>ValidTo</code> parameter. When value is
    *         <code>KEY_MATERIAL_DOES_NOT_EXPIRE</code>, you must omit the <code>ValidTo</code>
    *       parameter.</p>
    *          <p>You cannot change the <code>ExpirationModel</code> or <code>ValidTo</code> values for the
    *       current import after the request completes. To change either value, you must delete (<a>DeleteImportedKeyMaterial</a>) and reimport the key material.</p>
    */
  var ExpirationModel: js.UndefOr[ExpirationModelType | String] = js.undefined
  
  /**
    * <p>The import token that you received in the response to a previous <a>GetParametersForImport</a> request. It must be from the same response that contained
    *       the public key that you used to encrypt the key material.</p>
    */
  var ImportToken: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>The identifier of the symmetric encryption KMS key that receives the imported key
    *       material. This must be the same KMS key specified in the <code>KeyID</code> parameter of the
    *       corresponding <a>GetParametersForImport</a> request. The <code>Origin</code> of the
    *       KMS key must be <code>EXTERNAL</code>. You cannot perform this operation on an asymmetric KMS
    *       key, an HMAC KMS key, a KMS key in a custom key store, or on a KMS key in a different
    *       Amazon Web Services account</p>
    *          <p>Specify the key ID or key ARN of the KMS key.</p>
    *          <p>For example:</p>
    *          <ul>
    *             <li>
    *                <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The date and time when the imported key material expires. This parameter is required when
    *       the value of the <code>ExpirationModel</code> parameter is <code>KEY_MATERIAL_EXPIRES</code>.
    *       Otherwise it is not valid.</p>
    *          <p>The value of this parameter must be a future date and time. The maximum value is 365 days
    *       from the request date.</p>
    *          <p>When the key material expires, KMS deletes the key material from the KMS key. Without
    *       its key material, the KMS key is unusable. To use the KMS key in cryptographic operations, you
    *       must reimport the same key material.</p>
    *          <p>You cannot change the <code>ExpirationModel</code> or <code>ValidTo</code> values for the
    *       current import after the request completes. To change either value, you must delete (<a>DeleteImportedKeyMaterial</a>) and reimport the key material.</p>
    */
  var ValidTo: js.UndefOr[js.Date] = js.undefined
}
object ImportKeyMaterialRequest {
  
  inline def apply(): ImportKeyMaterialRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportKeyMaterialRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportKeyMaterialRequest] (val x: Self) extends AnyVal {
    
    inline def setEncryptedKeyMaterial(value: js.typedarray.Uint8Array): Self = StObject.set(x, "EncryptedKeyMaterial", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeyMaterialUndefined: Self = StObject.set(x, "EncryptedKeyMaterial", js.undefined)
    
    inline def setExpirationModel(value: ExpirationModelType | String): Self = StObject.set(x, "ExpirationModel", value.asInstanceOf[js.Any])
    
    inline def setExpirationModelUndefined: Self = StObject.set(x, "ExpirationModel", js.undefined)
    
    inline def setImportToken(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ImportToken", value.asInstanceOf[js.Any])
    
    inline def setImportTokenUndefined: Self = StObject.set(x, "ImportToken", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setValidTo(value: js.Date): Self = StObject.set(x, "ValidTo", value.asInstanceOf[js.Any])
    
    inline def setValidToUndefined: Self = StObject.set(x, "ValidTo", js.undefined)
  }
}
