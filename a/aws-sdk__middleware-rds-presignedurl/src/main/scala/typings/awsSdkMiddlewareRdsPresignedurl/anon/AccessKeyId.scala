package typings.awsSdkMiddlewareRdsPresignedurl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessKeyId extends js.Object {
  var accessKeyId: String
  var secretAccessKey: String
  var sessionToken: String
}

object AccessKeyId {
  @scala.inline
  def apply(accessKeyId: String, secretAccessKey: String, sessionToken: String): AccessKeyId = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyId]
  }
}

