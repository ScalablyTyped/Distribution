package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatchClause
  extends Node
     with Scopable {
  var body: BlockStatement
  var param: Identifier
  @JSName("type")
  var type_CatchClause: typings.babelDashTypes.babelDashTypesStrings.CatchClause
}

object CatchClause {
  @scala.inline
  def apply(
    body: BlockStatement,
    end: Double,
    loc: SourceLocation,
    param: Identifier,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.CatchClause,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause]
  }
}

@JSImport("babel-types", "catchClause")
@js.native
object catchClause extends js.Object {
  def apply(): CatchClause = js.native
  def apply(param: Identifier): CatchClause = js.native
  def apply(param: Identifier, body: BlockStatement): CatchClause = js.native
}

