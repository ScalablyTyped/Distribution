package typings.awsSdkMiddlewareEc2Copysnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessKeyId extends js.Object {
  var accessKeyId: String = js.native
  var secretAccessKey: String = js.native
  var sessionToken: String = js.native
}

object AccessKeyId {
  @scala.inline
  def apply(accessKeyId: String, secretAccessKey: String, sessionToken: String): AccessKeyId = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyId]
  }
  @scala.inline
  implicit class AccessKeyIdOps[Self <: AccessKeyId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretAccessKey(value: String): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
  }
  
}

