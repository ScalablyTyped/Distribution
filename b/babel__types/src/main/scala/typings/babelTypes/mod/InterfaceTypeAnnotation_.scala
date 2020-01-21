package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.InterfaceTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait InterfaceTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  var body: ObjectTypeAnnotation_
  var `extends`: js.Array[InterfaceExtends_] | Null
  @JSName("type")
  var type_InterfaceTypeAnnotation_ : InterfaceTypeAnnotation
}

object InterfaceTypeAnnotation_ {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation_,
    `type`: InterfaceTypeAnnotation,
    end: Int | Double = null,
    `extends`: js.Array[InterfaceExtends_] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceTypeAnnotation_]
  }
}

