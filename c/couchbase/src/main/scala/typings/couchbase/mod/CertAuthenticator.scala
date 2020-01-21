package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authenticator for performing certificate-based authentication.
  */
@JSImport("couchbase", "CertAuthenticator")
@js.native
/**
  * Create a new instance of the CertAuthenticator class.
  */
class CertAuthenticator () extends Authenticator {
  /* CompleteClass */
  override var password: String = js.native
  /* CompleteClass */
  override var username: String = js.native
}

