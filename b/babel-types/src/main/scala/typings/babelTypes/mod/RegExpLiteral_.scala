package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.RegExpLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral_
  extends Node
     with Expression
     with Literal {
  var flags: js.UndefOr[String] = js.undefined
  var pattern: String
  @JSName("type")
  var type_RegExpLiteral_ : RegExpLiteral
}

object RegExpLiteral_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    pattern: String,
    start: Double,
    `type`: RegExpLiteral,
    flags: String = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral_]
  }
}

