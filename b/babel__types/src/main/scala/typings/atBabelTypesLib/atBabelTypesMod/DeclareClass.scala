package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait DeclareClass
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends] | scala.Null
  var id: Identifier
  var implements: js.Array[ClassImplements] | scala.Null
  var mixins: js.Array[InterfaceExtends] | scala.Null
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_DeclareClass: atBabelTypesLib.atBabelTypesLibStrings.DeclareClass
}

object DeclareClass {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation,
    id: Identifier,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.DeclareClass,
    end: scala.Int | scala.Double = null,
    `extends`: js.Array[InterfaceExtends] = null,
    implements: js.Array[ClassImplements] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    mixins: js.Array[InterfaceExtends] = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): DeclareClass = {
    val __obj = js.Dynamic.literal(body = body, id = id)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (implements != null) __obj.updateDynamic("implements")(implements)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[DeclareClass]
  }
}

