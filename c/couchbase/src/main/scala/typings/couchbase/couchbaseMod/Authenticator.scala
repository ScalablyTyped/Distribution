package typings.couchbase.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Virtual base for authenticators.
  */
trait Authenticator extends js.Object {
  var password: String
  var username: String
}

object Authenticator {
  @scala.inline
  def apply(password: String, username: String): Authenticator = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Authenticator]
  }
}

