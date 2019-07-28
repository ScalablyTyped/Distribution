package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSPropertySignature
  extends TSTypeElement
     with BaseNode {
  var computed: Boolean | Null
  var initializer: Expression | Null
  var key: Expression
  var optional: Boolean | Null
  var readonly: Boolean | Null
  var typeAnnotation: TSTypeAnnotation | Null
  @JSName("type")
  var type_TSPropertySignature: typings.atBabelTypes.atBabelTypesStrings.TSPropertySignature
}

object TSPropertySignature {
  @scala.inline
  def apply(
    key: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSPropertySignature,
    computed: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null
  ): TSPropertySignature = {
    val __obj = js.Dynamic.literal(key = key)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSPropertySignature]
  }
}

