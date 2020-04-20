package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credential extends js.Object {
  /**
  		 * Unique ID identifying the credential
  		 */
  var credentialId: String
  /**
  		 * password
  		 */
  var password: String
}

object Credential {
  @scala.inline
  def apply(credentialId: String, password: String): Credential = {
    val __obj = js.Dynamic.literal(credentialId = credentialId.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
}

