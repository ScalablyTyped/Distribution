package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Virtual base for authenticators.
  */
trait Authenticator extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
}

object Authenticator {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String): Authenticator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Authenticator]
  }
}

