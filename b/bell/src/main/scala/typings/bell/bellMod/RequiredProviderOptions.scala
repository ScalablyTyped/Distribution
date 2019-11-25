package typings.bell.bellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredProviderOptions extends js.Object {
  /**
    * the OAuth client identifier (consumer key).
    */
  var clientId: String
  /**
    * the OAuth client secret (consumer secret)
    */
  var clientSecret: String
  /**
    * the cookie encryption password.
    * Used to encrypt the temporary state cookie used by the module in
    * between the authorization protocol steps.
    */
  var password: String
}

object RequiredProviderOptions {
  @scala.inline
  def apply(clientId: String, clientSecret: String, password: String): RequiredProviderOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequiredProviderOptions]
  }
}

