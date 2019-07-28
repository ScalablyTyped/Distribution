package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait DoWhileStatement
  extends BlockParent
     with BaseNode
     with Loop
     with Scopable
     with Statement
     with While {
  var body: Statement
  var test: Expression
  @JSName("type")
  var type_DoWhileStatement: typings.atBabelTypes.atBabelTypesStrings.DoWhileStatement
}

object DoWhileStatement {
  @scala.inline
  def apply(
    body: Statement,
    test: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.DoWhileStatement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body, test = test)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[DoWhileStatement]
  }
}

