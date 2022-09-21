package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateMacRequest extends StObject {
  
  /**
    * A list of grant tokens. Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved eventual consistency. For more information, see Grant token and Using a grant token in the Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
  
  /**
    * The HMAC KMS key to use in the operation. The MAC algorithm computes the HMAC for the message and the key as described in RFC 2104. To identify an HMAC KMS key, use the DescribeKey operation and see the KeySpec field in the response.
    */
  var KeyId: KeyIdType
  
  /**
    * The MAC algorithm used in the operation.  The algorithm must be compatible with the HMAC KMS key that you specify. To find the MAC algorithms that your HMAC KMS key supports, use the DescribeKey operation and see the MacAlgorithms field in the DescribeKey response.
    */
  var MacAlgorithm: MacAlgorithmSpec
  
  /**
    * The message to be hashed. Specify a message of up to 4,096 bytes.   GenerateMac and VerifyMac do not provide special handling for message digests. If you generate an HMAC for a hash digest of a message, you must verify the HMAC of the same hash digest.
    */
  var Message: PlaintextType
}
object GenerateMacRequest {
  
  inline def apply(KeyId: KeyIdType, MacAlgorithm: MacAlgorithmSpec, Message: PlaintextType): GenerateMacRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], MacAlgorithm = MacAlgorithm.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateMacRequest]
  }
  
  extension [Self <: GenerateMacRequest](x: Self) {
    
    inline def setGrantTokens(value: GrantTokenList): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: GrantTokenType*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setMacAlgorithm(value: MacAlgorithmSpec): Self = StObject.set(x, "MacAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: PlaintextType): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
  }
}
