package typings.awsSdk.credentialsMod

import typings.awsSdk.errorMod.AWSError
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials", "Credentials")
@js.native
class Credentials protected () extends js.Object {
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
  /**
    * AWS access key ID.
    */
  var accessKeyId: String = js.native
  /**
    * Time when credentials should be considered expired.
    * Used in conjunction with expired.
    */
  var expireTime: Date = js.native
  /**
    * Whether the credentials have been expired and require a refresh.
    * Used in conjunction with expireTime.
    */
  var expired: Boolean = js.native
  /**
    * AWS secret access key.
    */
  var secretAccessKey: String = js.native
  /**
    * AWS session token.
    */
  var sessionToken: String = js.native
  /**
    * Gets the existing credentials, refreshing them if they are not yet loaded or have expired.
    * Users should call this method before using refresh(), as this will not attempt to reload
    * credentials when they are already loaded into the object.
    *
    * @param {get} callback - Called when the instance metadata service responds. When called with no error, the credentials information has been loaded into the object.
    */
  def get(callback: js.Function1[/* err */ js.UndefOr[AWSError], Unit]): Unit = js.native
  /**
    * Gets the existing credentials, refreshing them if necessary, and returns
    * a promise that will be fulfilled immediately (if no refresh is necessary)
    * or when the refresh has completed.
    */
  def getPromise(): js.Promise[Unit] = js.native
  /**
    * Returns whether the credentials object should call refresh()
    */
  def needsRefresh(): Boolean = js.native
  /**
    * Refreshes the credentials.
    * Users should call get() before attempting to forcibly refresh credentials.
    *
    * @param {function} callback - Called when the instance metadata service responds. When called with no error, the credentials information has been loaded into the object.
    */
  def refresh(callback: js.Function1[/* err */ js.UndefOr[AWSError], Unit]): Unit = js.native
  /**
    * Invokes a credential refresh and returns a promise that will be fulfilled
    * when the refresh has completed or rejected when the refresh has failed.
    * Users should call get() before attempting to forcibly refresh credentials.
    */
  def refreshPromise(): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("aws-sdk/lib/credentials", "Credentials")
@js.native
object Credentials extends js.Object {
  var expiryWindow: Double = js.native
}

