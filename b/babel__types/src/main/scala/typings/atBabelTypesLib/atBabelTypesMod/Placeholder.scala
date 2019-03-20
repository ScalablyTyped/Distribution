package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder
  extends BaseNode
     with _Node {
  var expectedNode: atBabelTypesLib.atBabelTypesLibStrings.Identifier | atBabelTypesLib.atBabelTypesLibStrings.StringLiteral | atBabelTypesLib.atBabelTypesLibStrings.Expression | atBabelTypesLib.atBabelTypesLibStrings.Statement | atBabelTypesLib.atBabelTypesLibStrings.Declaration | atBabelTypesLib.atBabelTypesLibStrings.BlockStatement | atBabelTypesLib.atBabelTypesLibStrings.ClassBody | atBabelTypesLib.atBabelTypesLibStrings.Pattern
  var name: Identifier
  @JSName("type")
  var type_Placeholder: atBabelTypesLib.atBabelTypesLibStrings.Placeholder
}

object Placeholder {
  @scala.inline
  def apply(
    expectedNode: atBabelTypesLib.atBabelTypesLibStrings.Identifier | atBabelTypesLib.atBabelTypesLibStrings.StringLiteral | atBabelTypesLib.atBabelTypesLibStrings.Expression | atBabelTypesLib.atBabelTypesLibStrings.Statement | atBabelTypesLib.atBabelTypesLibStrings.Declaration | atBabelTypesLib.atBabelTypesLibStrings.BlockStatement | atBabelTypesLib.atBabelTypesLibStrings.ClassBody | atBabelTypesLib.atBabelTypesLibStrings.Pattern,
    name: Identifier,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.Placeholder,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): Placeholder = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Placeholder]
  }
}

