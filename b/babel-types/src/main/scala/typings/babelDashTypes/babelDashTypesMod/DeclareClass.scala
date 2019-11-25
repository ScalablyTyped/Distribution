package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclareClass
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends]
  var id: Identifier
  var typeParameters: TypeParameterDeclaration
  @JSName("type")
  var type_DeclareClass: typings.babelDashTypes.babelDashTypesStrings.DeclareClass
}

object DeclareClass {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation,
    end: Double,
    `extends`: js.Array[InterfaceExtends],
    id: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.DeclareClass,
    typeParameters: TypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareClass]
  }
}

@JSImport("babel-types", "declareClass")
@js.native
object declareClass extends js.Object {
  def apply(): DeclareClass = js.native
  def apply(id: Identifier): DeclareClass = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration): DeclareClass = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration, _extends: js.Array[InterfaceExtends]): DeclareClass = js.native
  def apply(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    _extends: js.Array[InterfaceExtends],
    body: ObjectTypeAnnotation
  ): DeclareClass = js.native
}

