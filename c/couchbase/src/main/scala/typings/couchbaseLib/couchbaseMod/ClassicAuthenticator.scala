package typings
package couchbaseLib.couchbaseMod

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
  def this(buckets: ScalablyTyped.runtime.StringDictionary[java.lang.String], username: java.lang.String, password: java.lang.String) = this()
  /* CompleteClass */
  override var password: java.lang.String = js.native
  /* CompleteClass */
  override var username: java.lang.String = js.native
}

