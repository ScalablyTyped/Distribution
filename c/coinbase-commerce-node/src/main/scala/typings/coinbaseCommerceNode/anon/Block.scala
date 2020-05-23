package typings.coinbaseCommerceNode.anon

import typings.coinbaseCommerceNode.mod.CryptoName
import typings.coinbaseCommerceNode.mod.PaymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var block: Confirmationsaccumulated
  var network: CryptoName
  var status: PaymentStatus
  var transaction_id: String
  var value: Crypto
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
}

