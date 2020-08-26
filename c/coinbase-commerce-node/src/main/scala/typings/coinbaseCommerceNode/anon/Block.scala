package typings.coinbaseCommerceNode.anon

import typings.coinbaseCommerceNode.mod.CryptoName
import typings.coinbaseCommerceNode.mod.PaymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  var block: Confirmationsaccumulated = js.native
  var network: CryptoName = js.native
  var status: PaymentStatus = js.native
  var transaction_id: String = js.native
  var value: Crypto = js.native
}

object Block {
  @scala.inline
  def apply(
    block: Confirmationsaccumulated,
    network: CryptoName,
    status: PaymentStatus,
    transaction_id: String,
    value: Crypto
  ): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
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
    def setBlock(value: Confirmationsaccumulated): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetwork(value: CryptoName): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PaymentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransaction_id(value: String): Self = this.set("transaction_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Crypto): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

