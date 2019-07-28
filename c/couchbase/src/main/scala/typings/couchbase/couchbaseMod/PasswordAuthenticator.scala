package typings.couchbase.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authenticator for using role-based authentication.
  */
@JSImport("couchbase", "PasswordAuthenticator")
@js.native
class PasswordAuthenticator protected () extends Authenticator {
  /**
    * Create a new instance of the PasswordAuthenticator class.
    * @param username RBAC username.
    * @param password RBAC password.
    */
  def this(username: String, password: String) = this()
  /* CompleteClass */
  override var password: String = js.native
  /* CompleteClass */
  override var username: String = js.native
}

