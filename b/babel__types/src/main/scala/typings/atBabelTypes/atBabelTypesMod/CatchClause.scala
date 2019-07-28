package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait CatchClause
  extends BlockParent
     with BaseNode
     with Scopable {
  var body: BlockStatement
  var param: Identifier | Null
  @JSName("type")
  var type_CatchClause: typings.atBabelTypes.atBabelTypesStrings.CatchClause
}

object CatchClause {
  @scala.inline
  def apply(
    body: BlockStatement,
    `type`: typings.atBabelTypes.atBabelTypesStrings.CatchClause,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    param: Identifier = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): CatchClause = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (param != null) __obj.updateDynamic("param")(param)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[CatchClause]
  }
}

