package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxLength extends js.Object {
  var maxLength: Double
  var messageTemplate: js.UndefOr[String] = js.undefined
}

object Anon_MaxLength {
  @scala.inline
  def apply(maxLength: Double, messageTemplate: String = null): Anon_MaxLength = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxLength]
  }
}

