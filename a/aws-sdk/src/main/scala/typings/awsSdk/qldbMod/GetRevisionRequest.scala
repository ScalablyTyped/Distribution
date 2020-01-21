package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRevisionRequest extends js.Object {
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
  def apply(
    BlockAddress: ValueHolder,
    DocumentId: UniqueId,
    Name: LedgerName,
    DigestTipAddress: ValueHolder = null
  ): GetRevisionRequest = {
    val __obj = js.Dynamic.literal(BlockAddress = BlockAddress.asInstanceOf[js.Any], DocumentId = DocumentId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (DigestTipAddress != null) __obj.updateDynamic("DigestTipAddress")(DigestTipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRevisionRequest]
  }
}

