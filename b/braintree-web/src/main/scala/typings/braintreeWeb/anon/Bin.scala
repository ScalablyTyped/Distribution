package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bin extends js.Object {
  var bin: String
  var nonce: String
}

object Bin {
  @scala.inline
  def apply(bin: String, nonce: String): Bin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bin]
  }
}

