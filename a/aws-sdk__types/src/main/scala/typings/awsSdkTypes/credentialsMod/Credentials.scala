package typings.awsSdkTypes.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  /**
    * AWS access key ID
    */
  val accessKeyId: String
  /**
    * UNIX epoch timestamp (seconds since 1 January, 1970 00:00:00 GMT) when
    * these credentials will no longer be accepted.
    */
  val expiration: js.UndefOr[Double] = js.undefined
  /**
    * AWS secret access key
    */
  val secretAccessKey: String
  /**
    * A security or session token to use with these credentials. Usually
    * present for temporary credentials.
    */
  val sessionToken: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    accessKeyId: String,
    secretAccessKey: String,
    expiration: Int | Double = null,
    sessionToken: String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

