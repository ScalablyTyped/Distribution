package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSIndexedAccessType
  extends TSType
     with BaseNode {
  var indexType: TSType
  var objectType: TSType
  @JSName("type")
  var type_TSIndexedAccessType: typings.atBabelTypes.atBabelTypesStrings.TSIndexedAccessType
}

object TSIndexedAccessType {
  @scala.inline
  def apply(
    indexType: TSType,
    objectType: TSType,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSIndexedAccessType,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType, objectType = objectType)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSIndexedAccessType]
  }
}

