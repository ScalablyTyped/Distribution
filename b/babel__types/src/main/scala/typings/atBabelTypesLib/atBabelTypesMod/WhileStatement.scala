package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait WhileStatement
  extends BlockParent
     with BaseNode
     with Loop
     with Scopable
     with Statement
     with While {
  var body: BlockStatement | Statement
  var test: Expression
  @JSName("type")
  var type_WhileStatement: atBabelTypesLib.atBabelTypesLibStrings.WhileStatement
}

object WhileStatement {
  @scala.inline
  def apply(
    body: BlockStatement | Statement,
    test: Expression,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.WhileStatement,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[WhileStatement]
  }
}

