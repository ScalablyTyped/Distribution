package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait InterfaceExtends
  extends Flow
     with BaseNode {
  var id: Identifier | QualifiedTypeIdentifier
  var typeParameters: TypeParameterInstantiation | Null
  @JSName("type")
  var type_InterfaceExtends: typings.atBabelTypes.atBabelTypesStrings.InterfaceExtends
}

object InterfaceExtends {
  @scala.inline
  def apply(
    id: Identifier | QualifiedTypeIdentifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.InterfaceExtends,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation = null
  ): InterfaceExtends = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceExtends]
  }
}

@JSImport("@babel/types", "interfaceExtends")
@js.native
object interfaceExtends extends js.Object {
  def apply(id: Identifier): InterfaceExtends = js.native
  def apply(id: Identifier, typeParameters: TypeParameterInstantiation): InterfaceExtends = js.native
  def apply(id: QualifiedTypeIdentifier): InterfaceExtends = js.native
  def apply(id: QualifiedTypeIdentifier, typeParameters: TypeParameterInstantiation): InterfaceExtends = js.native
}

