package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait IfStatement
  extends Conditional
     with BaseNode
     with Statement {
  var alternate: Statement | Null
  var consequent: Statement
  var test: Expression
  @JSName("type")
  var type_IfStatement: typings.atBabelTypes.atBabelTypesStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    consequent: Statement,
    test: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.IfStatement,
    alternate: Statement = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent, test = test)
    __obj.updateDynamic("type")(`type`)
    if (alternate != null) __obj.updateDynamic("alternate")(alternate)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[IfStatement]
  }
}

