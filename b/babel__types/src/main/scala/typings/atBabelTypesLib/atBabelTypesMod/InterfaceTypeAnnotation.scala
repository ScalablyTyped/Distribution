package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait InterfaceTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends] | scala.Null
  @JSName("type")
  var type_InterfaceTypeAnnotation: atBabelTypesLib.atBabelTypesLibStrings.InterfaceTypeAnnotation
}

object InterfaceTypeAnnotation {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.InterfaceTypeAnnotation,
    end: scala.Int | scala.Double = null,
    `extends`: js.Array[InterfaceExtends] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): InterfaceTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
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

