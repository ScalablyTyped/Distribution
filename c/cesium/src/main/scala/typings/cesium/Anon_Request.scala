package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: String
  var service: String
  var version: String
}

object Anon_Request {
  @scala.inline
  def apply(request: String, service: String, version: String): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request, service = service, version = version)
  
    __obj.asInstanceOf[Anon_Request]
  }
}

