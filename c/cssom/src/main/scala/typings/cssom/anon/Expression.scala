package typings.cssom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression extends js.Object {
  var expression: String
  var idx: Double
}

object Expression {
  @scala.inline
  def apply(expression: String, idx: Double): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

