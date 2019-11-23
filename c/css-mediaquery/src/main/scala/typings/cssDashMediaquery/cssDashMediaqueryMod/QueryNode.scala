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
    val __obj = js.Dynamic.literal(expressions = expressions, inverse = inverse)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryNode]
  }
}

