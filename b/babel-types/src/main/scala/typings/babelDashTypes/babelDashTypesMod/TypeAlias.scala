package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAlias
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier
  var right: FlowTypeAnnotation
  var typeParameters: TypeParameterDeclaration
  @JSName("type")
  var type_TypeAlias: typings.babelDashTypes.babelDashTypesStrings.TypeAlias
}

object TypeAlias {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TypeAlias,
    typeParameters: TypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TypeAlias = {
    val __obj = js.Dynamic.literal(end = end, id = id, loc = loc, right = right, start = start, typeParameters = typeParameters)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TypeAlias]
  }
}

@JSImport("babel-types", "typeAlias")
@js.native
object typeAlias extends js.Object {
  def apply(): TypeAlias = js.native
  def apply(id: Identifier): TypeAlias = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration): TypeAlias = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration, right: FlowTypeAnnotation): TypeAlias = js.native
}

