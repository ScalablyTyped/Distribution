package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ForOfStatement
  extends BlockParent
     with BaseNode
     with For
     with ForXStatement
     with Loop
     with Scopable
     with Statement {
  var await: Boolean
  var body: Statement
  var left: VariableDeclaration | LVal
  var right: Expression
  @JSName("type")
  var type_ForOfStatement: typings.atBabelTypes.atBabelTypesStrings.ForOfStatement
}

object ForOfStatement {
  @scala.inline
  def apply(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration | LVal,
    right: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ForOfStatement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ForOfStatement = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForOfStatement]
  }
}

@JSImport("@babel/types", "forOfStatement")
@js.native
object forOfStatement extends js.Object {
  def apply(left: LVal, right: Expression, body: Statement): ForOfStatement = js.native
  def apply(left: LVal, right: Expression, body: Statement, _await: Boolean): ForOfStatement = js.native
  def apply(left: VariableDeclaration, right: Expression, body: Statement): ForOfStatement = js.native
  def apply(left: VariableDeclaration, right: Expression, body: Statement, _await: Boolean): ForOfStatement = js.native
}

