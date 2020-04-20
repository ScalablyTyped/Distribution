package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthConnectUrlRequest extends js.Object {
  var redirectUri: String
  var scope: String
  var state: js.UndefOr[String] = js.undefined
}

object OAuthConnectUrlRequest {
  @scala.inline
  def apply(redirectUri: String, scope: String, state: String = null): OAuthConnectUrlRequest = {
    val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthConnectUrlRequest]
  }
}

