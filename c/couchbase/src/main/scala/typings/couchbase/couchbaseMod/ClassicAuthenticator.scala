package typings.couchbase.couchbaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authenticator for using classic authentication.
  */
@JSImport("couchbase", "ClassicAuthenticator")
@js.native
class ClassicAuthenticator protected () extends Authenticator {
  /**
    * Create a new instance of the ClassicAuthenticator class.
    * @param buckets Map of bucket names to passwords.
    * @param username Cluster administration username.
    * @param password Cluster administration password.
    */
  def this(buckets: StringDictionary[String], username: String, password: String) = this()
  /* CompleteClass */
  override var password: String = js.native
  /* CompleteClass */
  override var username: String = js.native
}

