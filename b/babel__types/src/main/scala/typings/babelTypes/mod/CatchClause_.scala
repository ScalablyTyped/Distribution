package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait CatchClause_
  extends BlockParent
     with BaseNode
     with Scopable {
  var body: BlockStatement_
  var param: Identifier_ | ArrayPattern_ | ObjectPattern_ | Null
  @JSName("type")
  var type_CatchClause_ : CatchClause
}

object CatchClause_ {
  @scala.inline
  def apply(
    body: BlockStatement_,
    `type`: CatchClause,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    param: Identifier_ | ArrayPattern_ | ObjectPattern_ = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause_]
  }
}

