package typings
package bellLib.bellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredProviderOptions extends js.Object {
  /**
    * the OAuth client identifier (consumer key).
    */
  var clientId: java.lang.String
  /**
    * the OAuth client secret (consumer secret)
    */
  var clientSecret: java.lang.String
  /**
    * the cookie encryption password.
    * Used to encrypt the temporary state cookie used by the module in
    * between the authorization protocol steps.
    */
  var password: java.lang.String
}

object RequiredProviderOptions {
  @scala.inline
  def apply(clientId: java.lang.String, clientSecret: java.lang.String, password: java.lang.String): RequiredProviderOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId, clientSecret = clientSecret, password = password)
  
    __obj.asInstanceOf[RequiredProviderOptions]
  }
}

