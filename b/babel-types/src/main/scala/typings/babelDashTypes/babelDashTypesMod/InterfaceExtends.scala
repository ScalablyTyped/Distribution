package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceExtends
  extends Node
     with Flow {
  var id: Identifier
  var typeParameters: TypeParameterInstantiation
  @JSName("type")
  var type_InterfaceExtends: typings.babelDashTypes.babelDashTypesStrings.InterfaceExtends
}

object InterfaceExtends {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.InterfaceExtends,
    typeParameters: TypeParameterInstantiation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): InterfaceExtends = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceExtends]
  }
}

@JSImport("babel-types", "interfaceExtends")
@js.native
object interfaceExtends extends js.Object {
  def apply(): InterfaceExtends = js.native
  def apply(id: Identifier): InterfaceExtends = js.native
  def apply(id: Identifier, typeParameters: TypeParameterInstantiation): InterfaceExtends = js.native
}

