package typings.awsSdkMiddlewareRdsPresignedurl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hostname extends js.Object {
  var hostname: String
  var path: String
  var protocol: String
}

object Hostname {
  @scala.inline
  def apply(hostname: String, path: String, protocol: String): Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
}

