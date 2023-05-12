package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateMacRequest extends StObject {
  
  /**
    * <p>A list of grant tokens.</p>
    *          <p>Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved <i>eventual consistency</i>. For more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a> and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant token</a> in the
    *     <i>Key Management Service Developer Guide</i>.</p>
    */
  var GrantTokens: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>The HMAC KMS key to use in the operation. The MAC algorithm computes the HMAC for the
    *       message and the key as described in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.</p>
    *          <p>To identify an HMAC KMS key, use the <a>DescribeKey</a> operation and see the
    *         <code>KeySpec</code> field in the response.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The MAC algorithm used in the operation.</p>
    *          <p> The algorithm must be compatible with the HMAC KMS key that you specify. To find the MAC
    *       algorithms that your HMAC KMS key supports, use the <a>DescribeKey</a> operation
    *       and see the <code>MacAlgorithms</code> field in the <code>DescribeKey</code> response.</p>
    */
  var MacAlgorithm: js.UndefOr[MacAlgorithmSpec | String] = js.undefined
  
  /**
    * <p>The message to be hashed. Specify a message of up to 4,096 bytes. </p>
    *          <p>
    *             <code>GenerateMac</code> and <a>VerifyMac</a> do not provide special handling
    *       for message digests. If you generate an HMAC for a hash digest of a message, you must verify
    *       the HMAC of the same hash digest.</p>
    */
  var Message: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object GenerateMacRequest {
  
  inline def apply(): GenerateMacRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateMacRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateMacRequest] (val x: Self) extends AnyVal {
    
    inline def setGrantTokens(value: js.Array[String]): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: String*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setMacAlgorithm(value: MacAlgorithmSpec | String): Self = StObject.set(x, "MacAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithmUndefined: Self = StObject.set(x, "MacAlgorithm", js.undefined)
    
    inline def setMessage(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
