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
  @scala.inline
  implicit class AWSSessionCredentialsOps[Self <: AWSSessionCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessKeyId(value: AccessKeyId): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretAccessKey(value: SecretAccessKey): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionToken(value: SessionToken): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
  }
  
}

