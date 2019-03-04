package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait IfStatement
  extends Conditional
     with BaseNode
     with Statement {
  var alternate: Statement | scala.Null
  var consequent: Statement
  var test: Expression
  @JSName("type")
  var type_IfStatement: atBabelTypesLib.atBabelTypesLibStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    consequent: Statement,
    test: Expression,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.IfStatement,
    alternate: Statement = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
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

