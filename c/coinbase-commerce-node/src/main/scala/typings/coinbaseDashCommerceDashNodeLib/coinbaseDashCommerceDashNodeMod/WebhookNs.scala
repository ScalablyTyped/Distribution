package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

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
object WebhookNs extends js.Object {
  /**
    * Verify a signature header.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#verify-signature-header
    */
  def verifySigHeader(rawBody: java.lang.String, signature: java.lang.String, sharedSecret: java.lang.String): scala.Unit = js.native
}

