package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral
  extends Node
     with Expression
     with Literal {
  var flags: js.UndefOr[String] = js.undefined
  var pattern: String
  @JSName("type")
  var type_RegExpLiteral: typings.babelDashTypes.babelDashTypesStrings.RegExpLiteral
}

object RegExpLiteral {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    pattern: String,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.RegExpLiteral,
    flags: String = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, pattern = pattern, start = start)
    __obj.updateDynamic("type")(`type`)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[RegExpLiteral]
  }
}

@JSImport("babel-types", "regExpLiteral")
@js.native
object regExpLiteral extends js.Object {
  def apply(): RegExpLiteral = js.native
  def apply(pattern: String): RegExpLiteral = js.native
  def apply(pattern: String, flags: String): RegExpLiteral = js.native
}

