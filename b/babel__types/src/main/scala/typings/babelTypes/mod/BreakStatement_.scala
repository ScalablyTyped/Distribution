package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BreakStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait BreakStatement_
  extends CompletionStatement
     with BaseNode
     with Statement
     with Terminatorless {
  var label: Identifier_ | Null
  @JSName("type")
  var type_BreakStatement_ : BreakStatement
}

object BreakStatement_ {
  @scala.inline
  def apply(
    `type`: BreakStatement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    label: Identifier_ = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): BreakStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakStatement_]
  }
}

