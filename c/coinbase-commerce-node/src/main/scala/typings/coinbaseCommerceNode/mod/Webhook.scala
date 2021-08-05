package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.mod.resources.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webhook class.
  *
  * @link https://github.com/coinbase/coinbase-commerce-node#webhooks
  */
object Webhook {
  
  @JSImport("coinbase-commerce-node", "Webhook")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Verify event body.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node/blob/v1.0.4/lib/Webhook.js#L10
    */
  inline def verifyEventBody(rawBody: String, signature: String, sharedSecret: String): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyEventBody")(rawBody.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], sharedSecret.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  /**
    * Verify a signature header.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#verify-signature-header
    */
  inline def verifySigHeader(rawBody: String, signature: String, sharedSecret: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySigHeader")(rawBody.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], sharedSecret.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
