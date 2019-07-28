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
    val __obj = js.Dynamic.literal(end = end, id = id, loc = loc, start = start, typeParameters = typeParameters)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[InterfaceExtends]
  }
}

