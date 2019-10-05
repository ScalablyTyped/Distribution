package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanLiteral
  extends Node
     with Expression
     with Immutable
     with Literal
     with Pureish {
  @JSName("type")
  var type_BooleanLiteral: typings.babelDashTypes.babelDashTypesStrings.BooleanLiteral
  var value: Boolean
}

object BooleanLiteral {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.BooleanLiteral,
    value: Boolean,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BooleanLiteral = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BooleanLiteral]
  }
}

@JSImport("babel-types", "booleanLiteral")
@js.native
object booleanLiteral extends js.Object {
  def apply(): BooleanLiteral = js.native
  def apply(value: Boolean): BooleanLiteral = js.native
}

