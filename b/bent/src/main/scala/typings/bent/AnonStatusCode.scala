package typings.bent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatusCode extends js.Object {
  var statusCode: Double
}

object AnonStatusCode {
  @scala.inline
  def apply(statusCode: Double): AnonStatusCode = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStatusCode]
  }
}

