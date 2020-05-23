package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
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
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    param: Identifier_ | ArrayPattern_ | ObjectPattern_ = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause_]
  }
}

