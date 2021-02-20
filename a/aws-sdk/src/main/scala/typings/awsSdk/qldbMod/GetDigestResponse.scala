package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDigestResponse extends StObject {
  
  /**
    * The 256-bit hash value representing the digest returned by a GetDigest request.
    */
  var Digest: typings.awsSdk.qldbMod.Digest = js.native
  
  /**
    * The latest block location covered by the digest that you requested. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo.
    */
  var DigestTipAddress: ValueHolder = js.native
}
object GetDigestResponse {
  
  @scala.inline
  def apply(Digest: Digest, DigestTipAddress: ValueHolder): GetDigestResponse = {
    val __obj = js.Dynamic.literal(Digest = Digest.asInstanceOf[js.Any], DigestTipAddress = DigestTipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDigestResponse]
  }
  
  @scala.inline
  implicit class GetDigestResponseMutableBuilder[Self <: GetDigestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: Digest): Self = StObject.set(x, "Digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestTipAddress(value: ValueHolder): Self = StObject.set(x, "DigestTipAddress", value.asInstanceOf[js.Any])
  }
}
