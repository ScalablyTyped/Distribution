package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait RegExpLiteral
  extends Expression
     with BaseNode
     with Literal {
  var flags: java.lang.String
  var pattern: java.lang.String
  @JSName("type")
  var type_RegExpLiteral: atBabelTypesLib.atBabelTypesLibStrings.RegExpLiteral
}

object RegExpLiteral {
  @scala.inline
  def apply(
    flags: java.lang.String,
    pattern: java.lang.String,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.RegExpLiteral,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags, pattern = pattern)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[RegExpLiteral]
  }
}

