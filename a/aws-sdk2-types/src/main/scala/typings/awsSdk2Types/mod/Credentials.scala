package typings.awsSdk2Types.mod

import typings.awsSdk2Types.libCredentialsMod.CredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk2-types", "Credentials")
@js.native
open class Credentials protected ()
  extends typings.awsSdk2Types.libCoreMod.Credentials {
  /**
    * Creates a Credentials object with a given set of credential information as an options hash.
    *
    * @param {object} options - An option hash containing a set of credential information.
    */
  def this(options: CredentialsOptions) = this()
  /**
    * Creates a Credentials object with a given set of credential information as positional arguments.
    *
    * @param {string} accessKeyId - The AWS access key ID.
    * @param {string} secretAccessKey - The AWS secret access key.
    * @param {string} sessionToken - The optional AWS session token.
    */
  def this(accessKeyId: String, secretAccessKey: String) = this()
  def this(accessKeyId: String, secretAccessKey: String, sessionToken: String) = this()
}
/* static members */
object Credentials {
  
  @JSImport("aws-sdk2-types", "Credentials")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-sdk2-types", "Credentials.expiryWindow")
  @js.native
  def expiryWindow: Double = js.native
  inline def expiryWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiryWindow")(x.asInstanceOf[js.Any])
}
