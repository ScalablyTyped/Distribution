package typings.cssom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpression extends js.Object {
  var expression: String
  var idx: Double
}

object AnonExpression {
  @scala.inline
  def apply(expression: String, idx: Double): AnonExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpression]
  }
}

