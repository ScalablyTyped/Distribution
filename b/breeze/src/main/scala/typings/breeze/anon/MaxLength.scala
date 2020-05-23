package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxLength extends js.Object {
  var maxLength: Double
  var messageTemplate: js.UndefOr[String] = js.undefined
}

object MaxLength {
  @scala.inline
  def apply(maxLength: Double, messageTemplate: String = null): MaxLength = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxLength]
  }
}

