package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthCreateTokenFromCodeRequest extends js.Object {
  var code: String
}

object OAuthCreateTokenFromCodeRequest {
  @scala.inline
  def apply(code: String): OAuthCreateTokenFromCodeRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthCreateTokenFromCodeRequest]
  }
}

