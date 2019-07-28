package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeQuery
  extends Node
     with TSType {
  var exprName: TSEntityName
  @JSName("type")
  var type_TSTypeQuery: typings.babelDashTypes.babelDashTypesStrings.TSTypeQuery
}

object TSTypeQuery {
  @scala.inline
  def apply(
    end: Double,
    exprName: TSEntityName,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSTypeQuery,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeQuery = {
    val __obj = js.Dynamic.literal(end = end, exprName = exprName, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeQuery]
  }
}

