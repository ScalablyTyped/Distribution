package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ForInStatement
  extends BlockParent
     with BaseNode
     with For
     with ForXStatement
     with Loop
     with Scopable
     with Statement {
  var body: Statement
  var left: VariableDeclaration | LVal
  var right: Expression
  @JSName("type")
  var type_ForInStatement: typings.atBabelTypes.atBabelTypesStrings.ForInStatement
}

object ForInStatement {
  @scala.inline
  def apply(
    body: Statement,
    left: VariableDeclaration | LVal,
    right: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ForInStatement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ForInStatement = {
    val __obj = js.Dynamic.literal(body = body, left = left.asInstanceOf[js.Any], right = right)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ForInStatement]
  }
}

