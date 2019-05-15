package typings
package coinbaseDashCommerceDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  var block: Anon_Confirmationsaccumulated
  var network: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CryptoName
  var status: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaymentStatus
  var transaction_id: java.lang.String
  var value: Anon_Crypto
}

object Anon_Block {
  @scala.inline
  def apply(
    block: Anon_Confirmationsaccumulated,
    network: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CryptoName,
    status: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaymentStatus,
    transaction_id: java.lang.String,
    value: Anon_Crypto
  ): Anon_Block = {
    val __obj = js.Dynamic.literal(block = block, network = network, status = status, transaction_id = transaction_id, value = value)
  
    __obj.asInstanceOf[Anon_Block]
  }
}

