package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDigestResponse extends StObject {
  
  /**
    * The 256-bit hash value representing the digest returned by a GetDigest request.
    */
  var Digest: typings.awsSdk.qldbMod.Digest
  
  /**
    * The latest block location covered by the digest that you requested. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo.
    */
  var DigestTipAddress: ValueHolder
}
object GetDigestResponse {
  
  inline def apply(Digest: Digest, DigestTipAddress: ValueHolder): GetDigestResponse = {
    val __obj = js.Dynamic.literal(Digest = Digest.asInstanceOf[js.Any], DigestTipAddress = DigestTipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDigestResponse]
  }
  
  extension [Self <: GetDigestResponse](x: Self) {
    
    inline def setDigest(value: Digest): Self = StObject.set(x, "Digest", value.asInstanceOf[js.Any])
    
    inline def setDigestTipAddress(value: ValueHolder): Self = StObject.set(x, "DigestTipAddress", value.asInstanceOf[js.Any])
  }
}
