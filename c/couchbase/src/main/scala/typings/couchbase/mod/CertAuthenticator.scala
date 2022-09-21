package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Authenticator for performing certificate-based authentication.
  */
@JSImport("couchbase", "CertAuthenticator")
@js.native
/**
  * Create a new instance of the CertAuthenticator class.
  */
open class CertAuthenticator ()
  extends StObject
     with Authenticator {
  
  /* CompleteClass */
  var password: String = js.native
  
  /* CompleteClass */
  var username: String = js.native
}
