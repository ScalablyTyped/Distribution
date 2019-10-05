package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webhook class.
  *
  * @link https://github.com/coinbase/coinbase-commerce-node#webhooks
  */
@JSImport("coinbase-commerce-node", "Webhook")
@js.native
object Webhook extends js.Object {
  /**
    * Verify a signature header.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#verify-signature-header
    */
  def verifySigHeader(rawBody: String, signature: String, sharedSecret: String): Unit = js.native
}

