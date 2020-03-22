package typings.azdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassword extends js.Object {
  var password: Boolean
  var prompt: String
}

object AnonPassword {
  @scala.inline
  def apply(password: Boolean, prompt: String): AnonPassword = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPassword]
  }
}

