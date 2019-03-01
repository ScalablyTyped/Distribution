package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ForStatement
  extends BlockParent
     with BaseNode
     with For
     with Loop
     with Scopable
     with Statement {
  var body: Statement
  var init: VariableDeclaration | Expression | scala.Null
  var test: Expression | scala.Null
  @JSName("type")
  var type_ForStatement: atBabelTypesLib.atBabelTypesLibStrings.ForStatement
  var update: Expression | scala.Null
}

object ForStatement {
  @scala.inline
  def apply(
    body: Statement,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ForStatement,
    end: scala.Int | scala.Double = null,
    init: VariableDeclaration | Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    test: Expression = null,
    trailingComments: js.Array[Comment] = null,
    update: Expression = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ForStatement]
  }
}

