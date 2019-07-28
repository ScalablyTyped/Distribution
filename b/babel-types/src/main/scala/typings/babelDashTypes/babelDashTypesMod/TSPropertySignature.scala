package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSPropertySignature
  extends Node
     with TSTypeElement {
  var computed: Boolean | Null
  var initializer: Expression | Null
  var key: Expression
  var optional: Boolean | Null
  var readonly: Boolean | Null
  var typeAnnotation: TSTypeAnnotation | Null
  @JSName("type")
  var type_TSPropertySignature: typings.babelDashTypes.babelDashTypesStrings.TSPropertySignature
}

object TSPropertySignature {
  @scala.inline
  def apply(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSPropertySignature,
    computed: js.UndefOr[Boolean] = js.undefined,
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSPropertySignature = {
    val __obj = js.Dynamic.literal(end = end, key = key, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSPropertySignature]
  }
}

