package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder
  extends BaseNode
     with _Node {
  var expectedNode: typings.atBabelTypes.atBabelTypesStrings.Identifier | typings.atBabelTypes.atBabelTypesStrings.StringLiteral | typings.atBabelTypes.atBabelTypesStrings.Expression | typings.atBabelTypes.atBabelTypesStrings.Statement | typings.atBabelTypes.atBabelTypesStrings.Declaration | typings.atBabelTypes.atBabelTypesStrings.BlockStatement | typings.atBabelTypes.atBabelTypesStrings.ClassBody | typings.atBabelTypes.atBabelTypesStrings.Pattern
  var name: Identifier
  @JSName("type")
  var type_Placeholder: typings.atBabelTypes.atBabelTypesStrings.Placeholder
}

object Placeholder {
  @scala.inline
  def apply(
    expectedNode: typings.atBabelTypes.atBabelTypesStrings.Identifier | typings.atBabelTypes.atBabelTypesStrings.StringLiteral | typings.atBabelTypes.atBabelTypesStrings.Expression | typings.atBabelTypes.atBabelTypesStrings.Statement | typings.atBabelTypes.atBabelTypesStrings.Declaration | typings.atBabelTypes.atBabelTypesStrings.BlockStatement | typings.atBabelTypes.atBabelTypesStrings.ClassBody | typings.atBabelTypes.atBabelTypesStrings.Pattern,
    name: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.Placeholder,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Placeholder = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
}

