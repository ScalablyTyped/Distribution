package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.mod.resources.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webhook class.
  *
  * @link https://github.com/coinbase/coinbase-commerce-node#webhooks
  */
object Webhook {
  
  /**
    * Verify event body.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node/blob/v1.0.4/lib/Webhook.js#L10
    */
  @JSImport("coinbase-commerce-node", "Webhook.verifyEventBody")
  @js.native
  def verifyEventBody(rawBody: String, signature: String, sharedSecret: String): Event = js.native
  
  /**
    * Verify a signature header.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#verify-signature-header
    */
  @JSImport("coinbase-commerce-node", "Webhook.verifySigHeader")
  @js.native
  def verifySigHeader(rawBody: String, signature: String, sharedSecret: String): Unit = js.native
}
