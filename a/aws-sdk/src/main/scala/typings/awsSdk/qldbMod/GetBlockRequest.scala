package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlockRequest extends js.Object {
  /**
    * The location of the block that you want to request. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14} 
    */
  var BlockAddress: ValueHolder = js.native
  /**
    * The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49} 
    */
  var DigestTipAddress: js.UndefOr[ValueHolder] = js.native
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
}

object GetBlockRequest {
  @scala.inline
  def apply(BlockAddress: ValueHolder, Name: LedgerName, DigestTipAddress: ValueHolder = null): GetBlockRequest = {
    val __obj = js.Dynamic.literal(BlockAddress = BlockAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (DigestTipAddress != null) __obj.updateDynamic("DigestTipAddress")(DigestTipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlockRequest]
  }
}

