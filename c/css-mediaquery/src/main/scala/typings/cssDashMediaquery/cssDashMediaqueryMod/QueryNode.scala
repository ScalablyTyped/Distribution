package typings.cssDashMediaquery.cssDashMediaqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryNode extends js.Object {
  var expressions: js.Array[Expression]
  var inverse: Boolean
  var `type`: String
}

object QueryNode {
  @scala.inline
  def apply(expressions: js.Array[Expression], inverse: Boolean, `type`: String): QueryNode = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryNode]
  }
}

