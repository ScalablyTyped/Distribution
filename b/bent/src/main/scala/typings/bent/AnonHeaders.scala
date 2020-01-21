package typings.bent

import typings.bent.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders extends js.Object {
  var headers: Headers
  var statusCode: Double
  var statusMessage: String
}

object AnonHeaders {
  @scala.inline
  def apply(headers: Headers, statusCode: Double, statusMessage: String): AnonHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeaders]
  }
}

