package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait OpaqueType
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier
  var impltype: FlowType
  var supertype: FlowType | Null
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_OpaqueType: typings.atBabelTypes.atBabelTypesStrings.OpaqueType
}

object OpaqueType {
  @scala.inline
  def apply(
    id: Identifier,
    impltype: FlowType,
    `type`: typings.atBabelTypes.atBabelTypesStrings.OpaqueType,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    supertype: FlowType = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): OpaqueType = {
    val __obj = js.Dynamic.literal(id = id, impltype = impltype)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (supertype != null) __obj.updateDynamic("supertype")(supertype)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[OpaqueType]
  }
}

@JSImport("@babel/types", "opaqueType")
@js.native
object opaqueType extends js.Object {
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType = js.native
  def apply(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], supertype: Null, impltype: FlowType): OpaqueType = js.native
  def apply(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], supertype: FlowType, impltype: FlowType): OpaqueType = js.native
  def apply(id: Identifier, typeParameters: Null, supertype: js.UndefOr[scala.Nothing], impltype: FlowType): OpaqueType = js.native
  def apply(id: Identifier, typeParameters: Null, supertype: Null, impltype: FlowType): OpaqueType = js.native
  def apply(id: Identifier, typeParameters: Null, supertype: FlowType, impltype: FlowType): OpaqueType = js.native
  def apply(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    supertype: js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration, supertype: Null, impltype: FlowType): OpaqueType = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration, supertype: FlowType, impltype: FlowType): OpaqueType = js.native
}

