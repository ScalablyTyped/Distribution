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
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSPropertySignature]
  }
}

@JSImport("@babel/types", "tsPropertySignature")
@js.native
object tsPropertySignature extends js.Object {
  def apply(key: Expression): TSPropertySignature = js.native
  def apply(key: Expression, typeAnnotation: TSTypeAnnotation): TSPropertySignature = js.native
  def apply(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression): TSPropertySignature = js.native
  def apply(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression, computed: Boolean): TSPropertySignature = js.native
  def apply(
    key: Expression,
    typeAnnotation: TSTypeAnnotation,
    initializer: Expression,
    computed: Boolean,
    optional: Boolean
  ): TSPropertySignature = js.native
  def apply(
    key: Expression,
    typeAnnotation: TSTypeAnnotation,
    initializer: Expression,
    computed: Boolean,
    optional: Boolean,
    readonly: Boolean
  ): TSPropertySignature = js.native
}

