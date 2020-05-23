package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSTypeAliasDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  var declare: Boolean | Null
  var id: Identifier_
  var typeAnnotation: TSType
  var typeParameters: TSTypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSTypeAliasDeclaration_ : TSTypeAliasDeclaration
}

object TSTypeAliasDeclaration_ {
  @scala.inline
  def apply(
    id: Identifier_,
    `type`: TSTypeAliasDeclaration,
    typeAnnotation: TSType,
    declare: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterDeclaration_ = null
  ): TSTypeAliasDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeAliasDeclaration_]
  }
}

