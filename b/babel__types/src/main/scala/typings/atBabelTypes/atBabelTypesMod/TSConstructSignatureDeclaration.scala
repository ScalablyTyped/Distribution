package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSConstructSignatureDeclaration
  extends TSTypeElement
     with BaseNode {
  var parameters: js.Array[Identifier | RestElement]
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TSTypeParameterDeclaration | Null
  @JSName("type")
  var type_TSConstructSignatureDeclaration: typings.atBabelTypes.atBabelTypesStrings.TSConstructSignatureDeclaration
}

object TSConstructSignatureDeclaration {
  @scala.inline
  def apply(
    parameters: js.Array[Identifier | RestElement],
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSConstructSignatureDeclaration,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null,
    typeParameters: TSTypeParameterDeclaration = null
  ): TSConstructSignatureDeclaration = {
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
    __obj.asInstanceOf[TSConstructSignatureDeclaration]
  }
}

@JSImport("@babel/types", "tsConstructSignatureDeclaration")
@js.native
object tsConstructSignatureDeclaration extends js.Object {
  def apply(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier | RestElement]): TSConstructSignatureDeclaration = js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructSignatureDeclaration = js.native
  def apply(typeParameters: Null, parameters: js.Array[Identifier | RestElement]): TSConstructSignatureDeclaration = js.native
  def apply(
    typeParameters: Null,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructSignatureDeclaration = js.native
  def apply(typeParameters: TSTypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSConstructSignatureDeclaration = js.native
  def apply(
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructSignatureDeclaration = js.native
}

