package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSMethodSignature
  extends TSTypeElement
     with BaseNode {
  var computed: Boolean | Null
  var key: Expression
  var optional: Boolean | Null
  var parameters: js.Array[Identifier | RestElement]
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TSTypeParameterDeclaration | Null
  @JSName("type")
  var type_TSMethodSignature: typings.atBabelTypes.atBabelTypesStrings.TSMethodSignature
}

object TSMethodSignature {
  @scala.inline
  def apply(
    key: Expression,
    parameters: js.Array[Identifier | RestElement],
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSMethodSignature,
    computed: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSMethodSignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSMethodSignature]
  }
}

@JSImport("@babel/types", "tsMethodSignature")
@js.native
object tsMethodSignature extends js.Object {
  def apply(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Null],
    parameters: js.Array[Identifier | RestElement]
  ): TSMethodSignature = js.native
  def apply(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Null],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
  def apply(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Null],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation,
    computed: Boolean
  ): TSMethodSignature = js.native
  def apply(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Null],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation,
    computed: Boolean,
    optional: Boolean
  ): TSMethodSignature = js.native
}

