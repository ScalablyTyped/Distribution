package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: java.lang.String
  var service: java.lang.String
  var version: java.lang.String
}

object Anon_Request {
  @scala.inline
  def apply(request: java.lang.String, service: java.lang.String, version: java.lang.String): Anon_Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("service")(service)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Request]
  }
}

