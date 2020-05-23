package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.OpaqueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait OpaqueType_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier_
  var impltype: FlowType
  var supertype: FlowType | Null
  var typeParameters: TypeParameterDeclaration_ | Null
  @JSName("type")
  var type_OpaqueType_ : OpaqueType
}

object OpaqueType_ {
  @scala.inline
  def apply(
    id: Identifier_,
    impltype: FlowType,
    `type`: OpaqueType,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    supertype: FlowType = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration_ = null
  ): OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], supertype = supertype.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpaqueType_]
  }
}

