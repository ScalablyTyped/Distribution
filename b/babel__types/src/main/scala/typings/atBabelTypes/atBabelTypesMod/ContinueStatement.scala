package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ContinueStatement
  extends CompletionStatement
     with BaseNode
     with Statement
     with Terminatorless {
  var label: Identifier | Null
  @JSName("type")
  var type_ContinueStatement: typings.atBabelTypes.atBabelTypesStrings.ContinueStatement
}

object ContinueStatement {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.ContinueStatement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    label: Identifier = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement]
  }
}

@JSImport("@babel/types", "continueStatement")
@js.native
object continueStatement extends js.Object {
  def apply(): ContinueStatement = js.native
  def apply(label: Identifier): ContinueStatement = js.native
}

