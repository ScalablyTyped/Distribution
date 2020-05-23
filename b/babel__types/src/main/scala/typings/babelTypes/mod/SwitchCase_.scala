package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.SwitchCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchCase_
  extends BaseNode
     with _Node {
  var consequent: js.Array[Statement]
  var test: Expression | Null
  @JSName("type")
  var type_SwitchCase_ : SwitchCase
}

object SwitchCase_ {
  @scala.inline
  def apply(
    consequent: js.Array[Statement],
    `type`: SwitchCase,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    test: Expression = null,
    trailingComments: js.Array[Comment] = null
  ): SwitchCase_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchCase_]
  }
}

