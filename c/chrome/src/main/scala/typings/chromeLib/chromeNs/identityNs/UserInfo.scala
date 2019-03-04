package typings
package chromeLib.chromeNs.identityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  /** An email address for the user account signed into the current profile. Empty if the user is not signed in or the identity.email manifest permission is not specified. */
  var email: java.lang.String
  /** A unique identifier for the account. This ID will not change for the lifetime of the account. Empty if the user is not signed in or (in M41+) the identity.email manifest permission is not specified. */
  var id: java.lang.String
}

object UserInfo {
  @scala.inline
  def apply(email: java.lang.String, id: java.lang.String): UserInfo = {
    val __obj = js.Dynamic.literal(email = email, id = id)
  
    __obj.asInstanceOf[UserInfo]
  }
}

