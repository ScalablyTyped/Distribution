package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchCase
  extends BaseNode
     with _Node {
  var consequent: js.Array[Statement]
  var test: Expression | scala.Null
  @JSName("type")
  var type_SwitchCase: atBabelTypesLib.atBabelTypesLibStrings.SwitchCase
}

object SwitchCase {
  @scala.inline
  def apply(
    consequent: js.Array[Statement],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.SwitchCase,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    test: Expression = null,
    trailingComments: js.Array[Comment] = null
  ): SwitchCase = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("consequent")(consequent)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SwitchCase]
  }
}

