package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSInterfaceDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  var body: TSInterfaceBody_
  var declare: Boolean | Null
  var `extends`: js.Array[TSExpressionWithTypeArguments_] | Null
  var id: Identifier_
  var typeParameters: TSTypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSInterfaceDeclaration_ : TSInterfaceDeclaration
}

object TSInterfaceDeclaration_ {
  @scala.inline
  def apply(
    body: TSInterfaceBody_,
    id: Identifier_,
    `type`: TSInterfaceDeclaration,
    declare: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    `extends`: js.Array[TSExpressionWithTypeArguments_] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterDeclaration_ = null
  ): TSInterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSInterfaceDeclaration_]
  }
}

