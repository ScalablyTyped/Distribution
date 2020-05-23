package typings.cathoQuantum.anon

import typings.cathoQuantum.inputMod.Validate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: String
  var validate: Validate
}

object Error {
  @scala.inline
  def apply(error: String, validate: Validate): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

