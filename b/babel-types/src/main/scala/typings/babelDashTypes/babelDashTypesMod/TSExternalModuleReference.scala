package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSExternalModuleReference extends Node {
  var expression: StringLiteral
  @JSName("type")
  var type_TSExternalModuleReference: typings.babelDashTypes.babelDashTypesStrings.TSExternalModuleReference
}

object TSExternalModuleReference {
  @scala.inline
  def apply(
    end: Double,
    expression: StringLiteral,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSExternalModuleReference,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSExternalModuleReference = {
    val __obj = js.Dynamic.literal(end = end, expression = expression, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSExternalModuleReference]
  }
}

