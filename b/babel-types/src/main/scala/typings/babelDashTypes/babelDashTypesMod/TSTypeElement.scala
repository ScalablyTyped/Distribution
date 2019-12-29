package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelDashTypes.babelDashTypesMod.TSCallSignatureDeclaration
  - typings.babelDashTypes.babelDashTypesMod.TSConstructSignatureDeclaration
  - typings.babelDashTypes.babelDashTypesMod.TSIndexSignature
  - typings.babelDashTypes.babelDashTypesMod.TSMethodSignature
  - typings.babelDashTypes.babelDashTypesMod.TSPropertySignature
*/
trait TSTypeElement extends js.Object

object TSTypeElement {
  @scala.inline
  def TSMethodSignature(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSMethodSignature,
    computed: js.UndefOr[Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    parameters: js.Array[Identifier | RestElement] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null,
    typeParameters: TypeParameterDeclaration = null
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSCallSignatureDeclaration(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSCallSignatureDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    parameters: js.Array[Identifier | RestElement] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null,
    typeParameters: TypeParameterDeclaration = null
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSPropertySignature(
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
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSIndexSignature(
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
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSConstructSignatureDeclaration(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSConstructSignatureDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    parameters: js.Array[Identifier | RestElement] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null,
    typeParameters: TypeParameterDeclaration = null
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
}

