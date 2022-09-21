package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Authenticator for using role-based authentication.
  */
@JSImport("couchbase", "PasswordAuthenticator")
@js.native
open class PasswordAuthenticator protected ()
  extends StObject
     with Authenticator {
  /**
    * Create a new instance of the PasswordAuthenticator class.
    * @param username RBAC username.
    * @param password RBAC password.
    */
  def this(username: String, password: String) = this()
  
  /* CompleteClass */
  var password: String = js.native
  
  /* CompleteClass */
  var username: String = js.native
}
