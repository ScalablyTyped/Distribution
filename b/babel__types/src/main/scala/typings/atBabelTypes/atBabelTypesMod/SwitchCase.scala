package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchCase
  extends BaseNode
     with _Node {
  var consequent: js.Array[Statement]
  var test: Expression | Null
  @JSName("type")
  var type_SwitchCase: typings.atBabelTypes.atBabelTypesStrings.SwitchCase
}

object SwitchCase {
  @scala.inline
  def apply(
    consequent: js.Array[Statement],
    `type`: typings.atBabelTypes.atBabelTypesStrings.SwitchCase,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    test: Expression = null,
    trailingComments: js.Array[Comment] = null
  ): SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchCase]
  }
}

@JSImport("@babel/types", "switchCase")
@js.native
object switchCase extends js.Object {
  def apply(test: js.UndefOr[scala.Nothing], consequent: js.Array[Statement]): SwitchCase = js.native
  def apply(test: Null, consequent: js.Array[Statement]): SwitchCase = js.native
  def apply(test: Expression, consequent: js.Array[Statement]): SwitchCase = js.native
}

