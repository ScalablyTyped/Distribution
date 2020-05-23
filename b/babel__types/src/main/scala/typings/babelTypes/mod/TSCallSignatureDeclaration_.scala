package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSCallSignatureDeclaration_
  extends TSTypeElement
     with BaseNode {
  var parameters: js.Array[Identifier_ | RestElement_]
  var typeAnnotation: TSTypeAnnotation_ | Null
  var typeParameters: TSTypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSCallSignatureDeclaration_ : TSCallSignatureDeclaration
}

object TSCallSignatureDeclaration_ {
  @scala.inline
  def apply(
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
  ): TSCallSignatureDeclaration_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSCallSignatureDeclaration_]
  }
}

