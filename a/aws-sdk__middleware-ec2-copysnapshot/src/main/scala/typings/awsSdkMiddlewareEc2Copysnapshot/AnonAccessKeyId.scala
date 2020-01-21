package typings.awsSdkMiddlewareEc2Copysnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessKeyId extends js.Object {
  var accessKeyId: String
  var secretAccessKey: String
  var sessionToken: String
}

object AnonAccessKeyId {
  @scala.inline
  def apply(accessKeyId: String, secretAccessKey: String, sessionToken: String): AnonAccessKeyId = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccessKeyId]
  }
}

