package typings.azdata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  var password: Boolean
  var prompt: String
}

object Password {
  @scala.inline
  def apply(password: Boolean, prompt: String): Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
}

