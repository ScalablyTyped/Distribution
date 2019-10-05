package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSTupleType
  extends TSType
     with BaseNode {
  var elementTypes: js.Array[TSType]
  @JSName("type")
  var type_TSTupleType: typings.atBabelTypes.atBabelTypesStrings.TSTupleType
}

object TSTupleType {
  @scala.inline
  def apply(
    elementTypes: js.Array[TSType],
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSTupleType,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTupleType]
  }
}

@JSImport("@babel/types", "tsTupleType")
@js.native
object tsTupleType extends js.Object {
  def apply(elementTypes: js.Array[TSType]): TSTupleType = js.native
}

