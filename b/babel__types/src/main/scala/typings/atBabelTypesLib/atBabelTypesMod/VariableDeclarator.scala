package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclarator
  extends BaseNode
     with _Node {
  var definite: scala.Boolean | scala.Null
  var id: LVal
  var init: Expression | scala.Null
  @JSName("type")
  var type_VariableDeclarator: atBabelTypesLib.atBabelTypesLibStrings.VariableDeclarator
}

object VariableDeclarator {
  @scala.inline
  def apply(
    id: LVal,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.VariableDeclarator,
    definite: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    init: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): VariableDeclarator = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    if (!js.isUndefined(definite)) __obj.updateDynamic("definite")(definite)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[VariableDeclarator]
  }
}

