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
  def apply(BlockAddress: ValueHolder, DocumentId: UniqueId, Name: LedgerName): GetRevisionRequest = {
    val __obj = js.Dynamic.literal(BlockAddress = BlockAddress.asInstanceOf[js.Any], DocumentId = DocumentId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRevisionRequest]
  }
  @scala.inline
  implicit class GetRevisionRequestOps[Self <: GetRevisionRequest] (val x: Self) extends AnyVal {
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
    def setBlockAddress(value: ValueHolder): Self = this.set("BlockAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentId(value: UniqueId): Self = this.set("DocumentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: LedgerName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDigestTipAddress(value: ValueHolder): Self = this.set("DigestTipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigestTipAddress: Self = this.set("DigestTipAddress", js.undefined)
  }
  
}

