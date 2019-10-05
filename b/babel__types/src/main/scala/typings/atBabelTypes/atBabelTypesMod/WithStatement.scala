package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait WithStatement
  extends Statement
     with BaseNode {
  var body: BlockStatement | Statement
  var `object`: Expression
  @JSName("type")
  var type_WithStatement: typings.atBabelTypes.atBabelTypesStrings.WithStatement
}

object WithStatement {
  @scala.inline
  def apply(
    body: BlockStatement | Statement,
    `object`: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.WithStatement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[WithStatement]
  }
}

@JSImport("@babel/types", "withStatement")
@js.native
object withStatement extends js.Object {
  def apply(`object`: Expression, body: BlockStatement): WithStatement = js.native
  def apply(`object`: Expression, body: Statement): WithStatement = js.native
}

