package typings.awsSdk.coreMod

import typings.awsSdk.credentialsMod.CredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/core", "Credentials")
@js.native
class Credentials protected ()
  extends typings.awsSdk.credentialsMod.Credentials {
  /**
    * Creates a Credentials object with a given set of credential information as an options hash.
    *
    * @param {object} options - An option hash containing a set of credential information.
    */
  def this(options: CredentialsOptions) = this()
  /**
    * Creates a Credentials object with a given set of credential information as positional arguments.
    *          *
    * @param {string} accessKeyId - The AWS access key ID.
    * @param {string} secretAccessKey - The AWS secret access key.
    * @param {string} sessionToken - The optional AWS session token.
    */
  def this(accessKeyId: String, secretAccessKey: String) = this()
  def this(accessKeyId: String, secretAccessKey: String, sessionToken: String) = this()
}
/* static members */
@JSImport("aws-sdk/lib/core", "Credentials")
@js.native
object Credentials extends js.Object {
  
  var expiryWindow: Double = js.native
}
