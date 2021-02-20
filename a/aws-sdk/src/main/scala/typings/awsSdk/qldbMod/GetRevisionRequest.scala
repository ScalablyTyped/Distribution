package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRevisionRequest extends StObject {
  
  /**
    * The block location of the document revision to be verified. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14} 
    */
  var BlockAddress: ValueHolder = js.native
  
  /**
    * The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49} 
    */
  var DigestTipAddress: js.UndefOr[ValueHolder] = js.native
  
  /**
    * The unique ID of the document to be verified.
    */
  var DocumentId: UniqueId = js.native
  
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
}
object GetRevisionRequest {
  
  @scala.inline
  def apply(BlockAddress: ValueHolder, DocumentId: UniqueId, Name: LedgerName): GetRevisionRequest = {
    val __obj = js.Dynamic.literal(BlockAddress = BlockAddress.asInstanceOf[js.Any], DocumentId = DocumentId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRevisionRequest]
  }
  
  @scala.inline
  implicit class GetRevisionRequestMutableBuilder[Self <: GetRevisionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockAddress(value: ValueHolder): Self = StObject.set(x, "BlockAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestTipAddress(value: ValueHolder): Self = StObject.set(x, "DigestTipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestTipAddressUndefined: Self = StObject.set(x, "DigestTipAddress", js.undefined)
    
    @scala.inline
    def setDocumentId(value: UniqueId): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
