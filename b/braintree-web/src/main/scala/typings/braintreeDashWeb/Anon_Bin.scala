package typings.braintreeDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bin extends js.Object {
  var bin: String
  var nonce: String
}

object Anon_Bin {
  @scala.inline
  def apply(bin: String, nonce: String): Anon_Bin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bin]
  }
}

