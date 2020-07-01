package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlacklistValidatorConfig[T /* <: js.Object */] extends SimpleValidatorConfig[T] {
  var blacklist: js.Array[String]
}

object BlacklistValidatorConfig {
  @scala.inline
  def apply[/* <: js.Object */ T](
    blacklist: js.Array[String],
    message: String,
    validateIf: (js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean = null
  ): BlacklistValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(blacklist = blacklist.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (validateIf != null) __obj.updateDynamic("validateIf")(validateIf.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlacklistValidatorConfig[T]]
  }
}

