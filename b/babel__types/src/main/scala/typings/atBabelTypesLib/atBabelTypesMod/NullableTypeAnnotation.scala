package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait NullableTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  var typeAnnotation: FlowType
  @JSName("type")
  var type_NullableTypeAnnotation: atBabelTypesLib.atBabelTypesLibStrings.NullableTypeAnnotation
}

object NullableTypeAnnotation {
  @scala.inline
  def apply(
    `type`: atBabelTypesLib.atBabelTypesLibStrings.NullableTypeAnnotation,
    typeAnnotation: FlowType,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): NullableTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[NullableTypeAnnotation]
  }
}

