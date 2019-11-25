package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait InterfaceDeclaration
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends] | Null
  var id: Identifier
  var implements: js.Array[ClassImplements] | Null
  var mixins: js.Array[InterfaceExtends] | Null
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_InterfaceDeclaration: typings.atBabelTypes.atBabelTypesStrings.InterfaceDeclaration
}

object InterfaceDeclaration {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation,
    id: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.InterfaceDeclaration,
    end: Int | Double = null,
    `extends`: js.Array[InterfaceExtends] = null,
    implements: js.Array[ClassImplements] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    mixins: js.Array[InterfaceExtends] = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (implements != null) __obj.updateDynamic("implements")(implements.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDeclaration]
  }
}

@JSImport("@babel/types", "interfaceDeclaration")
@js.native
object interfaceDeclaration extends js.Object {
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation
  ): InterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements]
  ): InterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements],
    mixins: js.Array[InterfaceExtends]
  ): InterfaceDeclaration = js.native
}

