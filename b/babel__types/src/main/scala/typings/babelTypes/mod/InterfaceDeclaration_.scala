package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.InterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait InterfaceDeclaration_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var body: ObjectTypeAnnotation_
  var `extends`: js.Array[InterfaceExtends_] | Null
  var id: Identifier_
  var implements: js.Array[ClassImplements_] | Null
  var mixins: js.Array[InterfaceExtends_] | Null
  var typeParameters: TypeParameterDeclaration_ | Null
  @JSName("type")
  var type_InterfaceDeclaration_ : InterfaceDeclaration
}

object InterfaceDeclaration_ {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation_,
    id: Identifier_,
    `type`: InterfaceDeclaration,
    end: Double = null.asInstanceOf[Double],
    `extends`: js.Array[InterfaceExtends_] = null,
    implements: js.Array[ClassImplements_] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    mixins: js.Array[InterfaceExtends_] = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration_ = null
  ): InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDeclaration_]
  }
}

