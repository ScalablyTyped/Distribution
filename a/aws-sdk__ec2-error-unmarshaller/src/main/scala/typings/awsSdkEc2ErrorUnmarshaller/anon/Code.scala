package typings.awsSdkEc2ErrorUnmarshaller.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var Code: String
  var Message: String
}

object Code {
  @scala.inline
  def apply(Code: String, Message: String): Code = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

