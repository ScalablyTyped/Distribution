package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchCase extends Node {
  var consequent: js.Array[Statement]
  var test: Expression
  @JSName("type")
  var type_SwitchCase: typings.babelDashTypes.babelDashTypesStrings.SwitchCase
}

object SwitchCase {
  @scala.inline
  def apply(
    consequent: js.Array[Statement],
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: typings.babelDashTypes.babelDashTypesStrings.SwitchCase,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent, end = end, loc = loc, start = start, test = test)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SwitchCase]
  }
}

