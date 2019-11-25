package typings.breeze

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expression extends js.Object {
  var expression: RegExp
  var messageTemplate: js.UndefOr[String] = js.undefined
}

object Anon_Expression {
  @scala.inline
  def apply(expression: RegExp, messageTemplate: String = null): Anon_Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Expression]
  }
}

