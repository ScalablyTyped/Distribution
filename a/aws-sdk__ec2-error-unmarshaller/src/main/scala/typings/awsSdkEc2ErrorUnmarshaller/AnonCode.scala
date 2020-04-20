package typings.awsSdkEc2ErrorUnmarshaller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var Code: String
  var Message: String
}

object AnonCode {
  @scala.inline
  def apply(Code: String, Message: String): AnonCode = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

