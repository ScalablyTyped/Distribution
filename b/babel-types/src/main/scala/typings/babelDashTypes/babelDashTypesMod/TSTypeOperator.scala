package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeOperator
  extends Node
     with TSType {
  var operator: String | Null
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSTypeOperator: typings.babelDashTypes.babelDashTypesStrings.TSTypeOperator
}

object TSTypeOperator {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSTypeOperator,
    typeAnnotation: TSType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    operator: String = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeOperator = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeOperator]
  }
}

