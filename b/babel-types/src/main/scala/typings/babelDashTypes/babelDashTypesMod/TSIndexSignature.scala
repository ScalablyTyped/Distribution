package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSIndexSignature
  extends Node
     with TSTypeElement {
  var parameters: js.Array[Identifier]
  var readonly: Boolean | Null
  var typeAnnotation: TSTypeAnnotation | Null
  @JSName("type")
  var type_TSIndexSignature: typings.babelDashTypes.babelDashTypesStrings.TSIndexSignature
}

object TSIndexSignature {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    parameters: js.Array[Identifier],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSIndexSignature,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSIndexSignature = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, parameters = parameters, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSIndexSignature]
  }
}

