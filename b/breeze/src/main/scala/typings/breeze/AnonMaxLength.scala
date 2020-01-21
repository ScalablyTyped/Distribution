package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxLength extends js.Object {
  var maxLength: Double
  var messageTemplate: js.UndefOr[String] = js.undefined
}

object AnonMaxLength {
  @scala.inline
  def apply(maxLength: Double, messageTemplate: String = null): AnonMaxLength = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxLength]
  }
}

