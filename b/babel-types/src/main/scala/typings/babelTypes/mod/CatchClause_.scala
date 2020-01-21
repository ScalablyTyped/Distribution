package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatchClause_
  extends Node
     with Scopable {
  var body: BlockStatement_
  var param: Identifier_
  @JSName("type")
  var type_CatchClause_ : CatchClause
}

object CatchClause_ {
  @scala.inline
  def apply(
    body: BlockStatement_,
    end: Double,
    loc: SourceLocation,
    param: Identifier_,
    start: Double,
    `type`: CatchClause,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause_]
  }
}

