package typings
package clearbladejsDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: clearbladejsDashServerLib.CbServerNs.BasicReq
}

object Anon_Request {
  @scala.inline
  def apply(request: clearbladejsDashServerLib.CbServerNs.BasicReq): Anon_Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[Anon_Request]
  }
}

