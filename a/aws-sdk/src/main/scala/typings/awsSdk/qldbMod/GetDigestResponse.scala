package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDigestResponse extends js.Object {
  
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
  implicit class GetDigestResponseOps[Self <: GetDigestResponse] (val x: Self) extends AnyVal {
    
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
    def setDigest(value: Digest): Self = this.set("Digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestTipAddress(value: ValueHolder): Self = this.set("DigestTipAddress", value.asInstanceOf[js.Any])
  }
}
