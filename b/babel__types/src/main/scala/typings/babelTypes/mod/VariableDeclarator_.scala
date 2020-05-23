package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclarator_
  extends BaseNode
     with _Node {
  var definite: Boolean | Null
  var id: LVal
  var init: Expression | Null
  @JSName("type")
  var type_VariableDeclarator_ : VariableDeclarator
}

object VariableDeclarator_ {
  @scala.inline
  def apply(
    id: LVal,
    `type`: VariableDeclarator,
    definite: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    init: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], definite = definite.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarator_]
  }
}

