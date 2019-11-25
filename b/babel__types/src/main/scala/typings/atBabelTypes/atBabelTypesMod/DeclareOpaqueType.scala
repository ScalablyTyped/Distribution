package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait DeclareOpaqueType
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier
  var supertype: FlowType | Null
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_DeclareOpaqueType: typings.atBabelTypes.atBabelTypesStrings.DeclareOpaqueType
}

object DeclareOpaqueType {
  @scala.inline
  def apply(
    id: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.DeclareOpaqueType,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    supertype: FlowType = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): DeclareOpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (supertype != null) __obj.updateDynamic("supertype")(supertype.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareOpaqueType]
  }
}

@JSImport("@babel/types", "declareOpaqueType")
@js.native
object declareOpaqueType extends js.Object {
  def apply(id: Identifier): DeclareOpaqueType = js.native
  def apply(id: Identifier, typeParameters: Null, supertype: FlowType): DeclareOpaqueType = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration): DeclareOpaqueType = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration, supertype: FlowType): DeclareOpaqueType = js.native
}

