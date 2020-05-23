package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nonce extends js.Object {
  var nonce: String
}

object Nonce {
  @scala.inline
  def apply(nonce: String): Nonce = {
    val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nonce]
  }
}

