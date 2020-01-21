package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageTemplate extends js.Object {
  var messageTemplate: js.UndefOr[String] = js.undefined
}

object AnonMessageTemplate {
  @scala.inline
  def apply(messageTemplate: String = null): AnonMessageTemplate = {
    val __obj = js.Dynamic.literal()
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageTemplate]
  }
}

