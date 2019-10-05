package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceDeclaration
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends]
  var id: Identifier
  var mixins: js.UndefOr[js.Array[_]] = js.undefined
  var typeParameters: TypeParameterDeclaration
  @JSName("type")
  var type_InterfaceDeclaration: typings.babelDashTypes.babelDashTypesStrings.InterfaceDeclaration
}

object InterfaceDeclaration {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation,
    end: Double,
    `extends`: js.Array[InterfaceExtends],
    id: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.InterfaceDeclaration,
    typeParameters: TypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    mixins: js.Array[_] = null,
    trailingComments: js.Array[Comment] = null
  ): InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body, end = end, id = id, loc = loc, start = start, typeParameters = typeParameters)
    __obj.updateDynamic("extends")(`extends`)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[InterfaceDeclaration]
  }
}

@JSImport("babel-types", "interfaceDeclaration")
@js.native
object interfaceDeclaration extends js.Object {
  def apply(): InterfaceDeclaration = js.native
  def apply(id: Identifier): InterfaceDeclaration = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration): InterfaceDeclaration = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration, _extends: js.Array[InterfaceExtends]): InterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    _extends: js.Array[InterfaceExtends],
    body: ObjectTypeAnnotation
  ): InterfaceDeclaration = js.native
}

