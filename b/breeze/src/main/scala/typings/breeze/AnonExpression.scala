package typings.breeze

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpression extends js.Object {
  var expression: RegExp
  var messageTemplate: js.UndefOr[String] = js.undefined
}

object AnonExpression {
  @scala.inline
  def apply(expression: RegExp, messageTemplate: String = null): AnonExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpression]
  }
}

