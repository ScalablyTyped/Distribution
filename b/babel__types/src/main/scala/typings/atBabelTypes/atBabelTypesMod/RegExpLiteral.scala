package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait RegExpLiteral
  extends Expression
     with BaseNode
     with Literal {
  var flags: String
  var pattern: String
  @JSName("type")
  var type_RegExpLiteral: typings.atBabelTypes.atBabelTypesStrings.RegExpLiteral
}

object RegExpLiteral {
  @scala.inline
  def apply(
    flags: String,
    pattern: String,
    `type`: typings.atBabelTypes.atBabelTypesStrings.RegExpLiteral,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
}

@JSImport("@babel/types", "regExpLiteral")
@js.native
object regExpLiteral extends js.Object {
  def apply(pattern: String): RegExpLiteral = js.native
  def apply(pattern: String, flags: String): RegExpLiteral = js.native
}

