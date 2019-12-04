package typings.atAwsDashSdkMiddlewareDashEc2DashCopysnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessKeyId extends js.Object {
  var accessKeyId: String
  var secretAccessKey: String
  var sessionToken: String
}

object Anon_AccessKeyId {
  @scala.inline
  def apply(accessKeyId: String, secretAccessKey: String, sessionToken: String): Anon_AccessKeyId = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AccessKeyId]
  }
}

