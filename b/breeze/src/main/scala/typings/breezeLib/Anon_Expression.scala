package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expression extends js.Object {
  var expression: stdLib.RegExp
  var messageTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Expression {
  @scala.inline
  def apply(expression: stdLib.RegExp, messageTemplate: java.lang.String = null): Anon_Expression = {
    val __obj = js.Dynamic.literal(expression = expression)
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate)
    __obj.asInstanceOf[Anon_Expression]
  }
}

