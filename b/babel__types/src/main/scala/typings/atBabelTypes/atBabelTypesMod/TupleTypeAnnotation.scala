package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TupleTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  @JSName("type")
  var type_TupleTypeAnnotation: typings.atBabelTypes.atBabelTypesStrings.TupleTypeAnnotation
  var types: js.Array[FlowType]
}

object TupleTypeAnnotation {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.TupleTypeAnnotation,
    types: js.Array[FlowType],
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TupleTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TupleTypeAnnotation]
  }
}

@JSImport("@babel/types", "tupleTypeAnnotation")
@js.native
object tupleTypeAnnotation extends js.Object {
  def apply(types: js.Array[FlowType]): TupleTypeAnnotation = js.native
}

