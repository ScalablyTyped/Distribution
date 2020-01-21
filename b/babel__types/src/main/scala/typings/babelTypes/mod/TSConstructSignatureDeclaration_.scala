package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSConstructSignatureDeclaration_
  extends TSTypeElement
     with BaseNode {
  var parameters: js.Array[Identifier_ | RestElement_]
  var typeAnnotation: TSTypeAnnotation_ | Null
  var typeParameters: TSTypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSConstructSignatureDeclaration_ : TSConstructSignatureDeclaration
}

object TSConstructSignatureDeclaration_ {
  @scala.inline
  def apply(
    parameters: js.Array[Identifier_ | RestElement_],
    `type`: TSConstructSignatureDeclaration,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation_ = null,
    typeParameters: TSTypeParameterDeclaration_ = null
  ): TSConstructSignatureDeclaration_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSConstructSignatureDeclaration_]
  }
}

