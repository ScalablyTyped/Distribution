package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait NullLiteral
  extends Expression
     with BaseNode
     with Immutable
     with Literal
     with Pureish {
  @JSName("type")
  var type_NullLiteral: typings.atBabelTypes.atBabelTypesStrings.NullLiteral
}

object NullLiteral {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.NullLiteral,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[NullLiteral]
  }
}

@JSImport("@babel/types", "nullLiteral")
@js.native
object nullLiteral extends js.Object {
  def apply(): NullLiteral = js.native
}

