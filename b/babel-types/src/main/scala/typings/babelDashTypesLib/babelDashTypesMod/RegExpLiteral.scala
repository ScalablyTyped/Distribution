package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral
  extends Node
     with Expression
     with Literal {
  var flags: js.UndefOr[java.lang.String] = js.undefined
  var pattern: java.lang.String
  @JSName("type")
  var type_RegExpLiteral: babelDashTypesLib.babelDashTypesLibStrings.RegExpLiteral
}

object RegExpLiteral {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    pattern: java.lang.String,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.RegExpLiteral,
    flags: java.lang.String = null,
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

