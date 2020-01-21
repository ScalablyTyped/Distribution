package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxLengthMessageTemplate extends js.Object {
  var maxLength: Double
  var messageTemplate: js.UndefOr[String] = js.undefined
  var minLength: Double
}

object AnonMaxLengthMessageTemplate {
  @scala.inline
  def apply(maxLength: Double, minLength: Double, messageTemplate: String = null): AnonMaxLengthMessageTemplate = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxLengthMessageTemplate]
  }
}

