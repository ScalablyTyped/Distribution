package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypePredicate
  extends Node
     with TSType {
  var parameterName: Identifier | TSThisType
  var typeAnnotation: TSTypeAnnotation
  @JSName("type")
  var type_TSTypePredicate: typings.babelDashTypes.babelDashTypesStrings.TSTypePredicate
}

object TSTypePredicate {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    parameterName: Identifier | TSThisType,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSTypePredicate,
    typeAnnotation: TSTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypePredicate = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, parameterName = parameterName.asInstanceOf[js.Any], start = start, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypePredicate]
  }
}

