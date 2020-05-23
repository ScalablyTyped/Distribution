package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTemplate extends js.Object {
  var messageTemplate: js.UndefOr[String] = js.undefined
}

object MessageTemplate {
  @scala.inline
  def apply(messageTemplate: String = null): MessageTemplate = {
    val __obj = js.Dynamic.literal()
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTemplate]
  }
}

