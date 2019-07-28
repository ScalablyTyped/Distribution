package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxLengthMessageTemplate extends js.Object {
  var maxLength: Double
  var messageTemplate: js.UndefOr[String] = js.undefined
  var minLength: Double
}

object Anon_MaxLengthMessageTemplate {
  @scala.inline
  def apply(maxLength: Double, minLength: Double, messageTemplate: String = null): Anon_MaxLengthMessageTemplate = {
    val __obj = js.Dynamic.literal(maxLength = maxLength, minLength = minLength)
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate)
    __obj.asInstanceOf[Anon_MaxLengthMessageTemplate]
  }
}

