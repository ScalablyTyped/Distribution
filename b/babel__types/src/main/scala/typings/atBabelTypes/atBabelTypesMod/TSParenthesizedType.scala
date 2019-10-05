package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSParenthesizedType
  extends TSType
     with BaseNode {
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSParenthesizedType: typings.atBabelTypes.atBabelTypesStrings.TSParenthesizedType
}

object TSParenthesizedType {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSParenthesizedType,
    typeAnnotation: TSType,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSParenthesizedType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSParenthesizedType]
  }
}

@JSImport("@babel/types", "tsParenthesizedType")
@js.native
object tsParenthesizedType extends js.Object {
  def apply(typeAnnotation: TSType): TSParenthesizedType = js.native
}

