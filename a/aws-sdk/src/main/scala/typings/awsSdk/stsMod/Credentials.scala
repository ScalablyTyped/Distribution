package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  /**
    * The access key ID that identifies the temporary security credentials.
    */
  var AccessKeyId: accessKeyIdType = js.native
  /**
    * The date on which the current credentials expire.
    */
  var Expiration: dateType = js.native
  /**
    * The secret access key that can be used to sign requests.
    */
  var SecretAccessKey: accessKeySecretType = js.native
  /**
    * The token that users must pass to the service API to use the temporary credentials.
    */
  var SessionToken: tokenType = js.native
}

object Credentials {
  @scala.inline
  def apply(
    AccessKeyId: accessKeyIdType,
    Expiration: dateType,
    SecretAccessKey: accessKeySecretType,
    SessionToken: tokenType
  ): Credentials = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], Expiration = Expiration.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], SessionToken = SessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

