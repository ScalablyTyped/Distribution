package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Decorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decorator_
  extends BaseNode
     with _Node {
  var expression: Expression
  @JSName("type")
  var type_Decorator_ : Decorator
}

object Decorator_ {
  @scala.inline
  def apply(
    expression: Expression,
    `type`: Decorator,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): Decorator_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorator_]
  }
}

