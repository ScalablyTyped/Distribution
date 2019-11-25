package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassImplements
  extends Node
     with Flow {
  var id: Identifier
  var typeParameters: TypeParameterInstantiation
  @JSName("type")
  var type_ClassImplements: typings.babelDashTypes.babelDashTypesStrings.ClassImplements
}

object ClassImplements {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ClassImplements,
    typeParameters: TypeParameterInstantiation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ClassImplements = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassImplements]
  }
}

@JSImport("babel-types", "classImplements")
@js.native
object classImplements extends js.Object {
  def apply(): ClassImplements = js.native
  def apply(id: Identifier): ClassImplements = js.native
  def apply(id: Identifier, typeParameters: TypeParameterInstantiation): ClassImplements = js.native
}

