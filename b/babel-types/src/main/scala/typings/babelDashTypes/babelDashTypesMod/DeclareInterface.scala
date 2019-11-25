package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclareInterface
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
  var type_DeclareInterface: typings.babelDashTypes.babelDashTypesStrings.DeclareInterface
}

object DeclareInterface {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation,
    end: Double,
    `extends`: js.Array[InterfaceExtends],
    id: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.DeclareInterface,
    typeParameters: TypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareInterface = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareInterface]
  }
}

@JSImport("babel-types", "declareInterface")
@js.native
object declareInterface extends js.Object {
  def apply(): DeclareInterface = js.native
  def apply(id: Identifier): DeclareInterface = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration): DeclareInterface = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration, _extends: js.Array[InterfaceExtends]): DeclareInterface = js.native
  def apply(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    _extends: js.Array[InterfaceExtends],
    body: ObjectTypeAnnotation
  ): DeclareInterface = js.native
}

