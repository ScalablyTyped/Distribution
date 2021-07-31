package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlockRequest extends StObject {
  
  /**
    * The location of the block that you want to request. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14} 
    */
  var BlockAddress: ValueHolder
  
  /**
    * The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49} 
    */
  var DigestTipAddress: js.UndefOr[ValueHolder] = js.undefined
  
  /**
    * The name of the ledger.
    */
  var Name: LedgerName
}
object GetBlockRequest {
  
  @scala.inline
  def apply(BlockAddress: ValueHolder, Name: LedgerName): GetBlockRequest = {
    val __obj = js.Dynamic.literal(BlockAddress = BlockAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlockRequest]
  }
  
  @scala.inline
  implicit class GetBlockRequestMutableBuilder[Self <: GetBlockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockAddress(value: ValueHolder): Self = StObject.set(x, "BlockAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestTipAddress(value: ValueHolder): Self = StObject.set(x, "DigestTipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestTipAddressUndefined: Self = StObject.set(x, "DigestTipAddress", js.undefined)
    
    @scala.inline
    def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
