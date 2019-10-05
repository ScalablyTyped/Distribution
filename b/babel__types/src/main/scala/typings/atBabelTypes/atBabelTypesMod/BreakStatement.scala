package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait BreakStatement
  extends CompletionStatement
     with BaseNode
     with Statement
     with Terminatorless {
  var label: Identifier | Null
  @JSName("type")
  var type_BreakStatement: typings.atBabelTypes.atBabelTypesStrings.BreakStatement
}

object BreakStatement {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.BreakStatement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    label: Identifier = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (label != null) __obj.updateDynamic("label")(label)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BreakStatement]
  }
}

@JSImport("@babel/types", "breakStatement")
@js.native
object breakStatement extends js.Object {
  def apply(): BreakStatement = js.native
  def apply(label: Identifier): BreakStatement = js.native
}

