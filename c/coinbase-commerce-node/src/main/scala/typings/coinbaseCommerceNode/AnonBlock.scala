package typings.coinbaseCommerceNode

import typings.coinbaseCommerceNode.mod.CryptoName
import typings.coinbaseCommerceNode.mod.PaymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlock extends js.Object {
  var block: AnonConfirmationsaccumulated
  var network: CryptoName
  var status: PaymentStatus
  var transaction_id: String
  var value: AnonCrypto
}

object AnonBlock {
  @scala.inline
  def apply(
    block: AnonConfirmationsaccumulated,
    network: CryptoName,
    status: PaymentStatus,
    transaction_id: String,
    value: AnonCrypto
  ): AnonBlock = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlock]
  }
}

