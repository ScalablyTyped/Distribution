package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyMacRequest extends StObject {
  
  /**
    * <p>A list of grant tokens.</p>
    *          <p>Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved <i>eventual consistency</i>. For more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant token</a> in the
    *     <i>Key Management Service Developer Guide</i>.</p>
    */
  var GrantTokens: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>The KMS key that will be used in the verification.</p>
    *          <p>Enter a key ID of the KMS key that was used to generate the HMAC. If you identify a
    *       different KMS key, the <code>VerifyMac</code> operation fails.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The HMAC to verify. Enter the HMAC that was generated by the <a>GenerateMac</a>
    *       operation when you specified the same message, HMAC KMS key, and MAC algorithm as the values
    *       specified in this request.</p>
    */
  var Mac: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>The MAC algorithm that will be used in the verification. Enter the same MAC algorithm that
    *       was used to compute the HMAC. This algorithm must be supported by the HMAC KMS key identified
    *       by the <code>KeyId</code> parameter.</p>
    */
  var MacAlgorithm: js.UndefOr[MacAlgorithmSpec | String] = js.undefined
  
  /**
    * <p>The message that will be used in the verification. Enter the same message that was used to
    *       generate the HMAC.</p>
    *          <p>
    *             <a>GenerateMac</a> and <code>VerifyMac</code> do not provide special handling
    *       for message digests. If you generated an HMAC for a hash digest of a message, you must verify
    *       the HMAC for the same hash digest.</p>
    */
  var Message: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object VerifyMacRequest {
  
  inline def apply(): VerifyMacRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyMacRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyMacRequest] (val x: Self) extends AnyVal {
    
    inline def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setMac(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Mac", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithm(value: MacAlgorithmSpec | String): Self = StObject.set(x, "MacAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithmUndefined: Self = StObject.set(x, "MacAlgorithm", js.undefined)
    
    inline def setMacUndefined: Self = StObject.set(x, "Mac", js.undefined)
    
    inline def setMessage(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
