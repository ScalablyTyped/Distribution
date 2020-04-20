package typings.awsSdkMiddlewareEc2Copysnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostname extends js.Object {
  var hostname: String
  var path: String
  var protocol: String
}

object AnonHostname {
  @scala.inline
  def apply(hostname: String, path: String, protocol: String): AnonHostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostname]
  }
}

