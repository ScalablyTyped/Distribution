package typings.couchbase.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Authenticator for using classic authentication.
  */
@JSImport("couchbase", "ClassicAuthenticator")
@js.native
open class ClassicAuthenticator protected ()
  extends StObject
     with Authenticator {
  /**
    * Create a new instance of the ClassicAuthenticator class.
    * @param buckets Map of bucket names to passwords.
    * @param username Cluster administration username.
    * @param password Cluster administration password.
    */
  def this(buckets: StringDictionary[String], username: String, password: String) = this()
  
  /* CompleteClass */
  var password: String = js.native
  
  /* CompleteClass */
  var username: String = js.native
}
