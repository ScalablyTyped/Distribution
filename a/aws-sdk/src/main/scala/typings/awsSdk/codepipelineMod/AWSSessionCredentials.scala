package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AWSSessionCredentials extends js.Object {
  /**
    * The access key for the session.
    */
  var accessKeyId: AccessKeyId = js.native
  /**
    * The secret access key for the session.
    */
  var secretAccessKey: SecretAccessKey = js.native
  /**
    * The token for the session.
    */
  var sessionToken: SessionToken = js.native
}

object AWSSessionCredentials {
  @scala.inline
  def apply(accessKeyId: AccessKeyId, secretAccessKey: SecretAccessKey, sessionToken: SessionToken): AWSSessionCredentials = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWSSessionCredentials]
  }
}

