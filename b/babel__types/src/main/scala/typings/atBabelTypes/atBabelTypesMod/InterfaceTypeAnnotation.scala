package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait InterfaceTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends] | Null
  @JSName("type")
  var type_InterfaceTypeAnnotation: typings.atBabelTypes.atBabelTypesStrings.InterfaceTypeAnnotation
}

object InterfaceTypeAnnotation {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation,
    `type`: typings.atBabelTypes.atBabelTypesStrings.InterfaceTypeAnnotation,
    end: Int | Double = null,
    `extends`: js.Array[InterfaceExtends] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): InterfaceTypeAnnotation = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[InterfaceTypeAnnotation]
  }
}

@JSImport("@babel/types", "interfaceTypeAnnotation")
@js.native
object interfaceTypeAnnotation extends js.Object {
  def apply(_extends: js.UndefOr[scala.Nothing], body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
  def apply(_extends: js.Array[InterfaceExtends], body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
  def apply(_extends: Null, body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
}

