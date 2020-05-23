package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration
import typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
import typings.babelTypes.babelTypesStrings.TSIndexSignature
import typings.babelTypes.babelTypesStrings.TSMethodSignature
import typings.babelTypes.babelTypesStrings.TSPropertySignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.TSCallSignatureDeclaration_
  - typings.babelTypes.mod.TSConstructSignatureDeclaration_
  - typings.babelTypes.mod.TSPropertySignature_
  - typings.babelTypes.mod.TSMethodSignature_
  - typings.babelTypes.mod.TSIndexSignature_
*/
trait TSTypeElement extends _Node

object TSTypeElement {
  @scala.inline
  def TSPropertySignature_(
    key: Expression,
    `type`: TSPropertySignature,
    computed: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    initializer: Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: Boolean = null.asInstanceOf[Boolean],
    readonly: Boolean = null.asInstanceOf[Boolean],
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation_ = null
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSCallSignatureDeclaration_(
    parameters: js.Array[Identifier_ | RestElement_],
    `type`: TSCallSignatureDeclaration,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation_ = null,
    typeParameters: TSTypeParameterDeclaration_ = null
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSMethodSignature_(
    key: Expression,
    parameters: js.Array[Identifier_ | RestElement_],
    `type`: TSMethodSignature,
    computed: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: Boolean = null.asInstanceOf[Boolean],
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation_ = null,
    typeParameters: TSTypeParameterDeclaration_ = null
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSConstructSignatureDeclaration_(
    parameters: js.Array[Identifier_ | RestElement_],
    `type`: TSConstructSignatureDeclaration,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation_ = null,
    typeParameters: TSTypeParameterDeclaration_ = null
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSIndexSignature_(
    parameters: js.Array[Identifier_],
    `type`: TSIndexSignature,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    readonly: Boolean = null.asInstanceOf[Boolean],
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation_ = null
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
}

