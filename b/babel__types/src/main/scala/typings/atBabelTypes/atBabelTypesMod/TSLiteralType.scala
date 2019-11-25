package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSLiteralType
  extends TSType
     with BaseNode {
  var literal: NumericLiteral | StringLiteral | BooleanLiteral
  @JSName("type")
  var type_TSLiteralType: typings.atBabelTypes.atBabelTypesStrings.TSLiteralType
}

object TSLiteralType {
  @scala.inline
  def apply(
    literal: NumericLiteral | StringLiteral | BooleanLiteral,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSLiteralType,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSLiteralType]
  }
}

@JSImport("@babel/types", "tsLiteralType")
@js.native
object tsLiteralType extends js.Object {
  def apply(literal: BooleanLiteral): TSLiteralType = js.native
  def apply(literal: NumericLiteral): TSLiteralType = js.native
  def apply(literal: StringLiteral): TSLiteralType = js.native
}

