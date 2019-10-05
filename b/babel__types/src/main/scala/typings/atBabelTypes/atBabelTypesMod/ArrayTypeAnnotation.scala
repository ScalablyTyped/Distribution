package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ArrayTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  var elementType: FlowType
  @JSName("type")
  var type_ArrayTypeAnnotation: typings.atBabelTypes.atBabelTypesStrings.ArrayTypeAnnotation
}

object ArrayTypeAnnotation {
  @scala.inline
  def apply(
    elementType: FlowType,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ArrayTypeAnnotation,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ArrayTypeAnnotation = {
    val __obj = js.Dynamic.literal(elementType = elementType)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ArrayTypeAnnotation]
  }
}

@JSImport("@babel/types", "arrayTypeAnnotation")
@js.native
object arrayTypeAnnotation extends js.Object {
  def apply(elementType: FlowType): ArrayTypeAnnotation = js.native
}

