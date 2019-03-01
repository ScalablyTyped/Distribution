package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TypeParameter
  extends Flow
     with BaseNode {
  var bound: TypeAnnotation | scala.Null
  var default: FlowType | scala.Null
  var name: java.lang.String | scala.Null
  @JSName("type")
  var type_TypeParameter: atBabelTypesLib.atBabelTypesLibStrings.TypeParameter
  var variance: Variance | scala.Null
}

object TypeParameter {
  @scala.inline
  def apply(
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TypeParameter,
    bound: TypeAnnotation = null,
    default: FlowType = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    name: java.lang.String = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    variance: Variance = null
  ): TypeParameter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (bound != null) __obj.updateDynamic("bound")(bound)
    if (default != null) __obj.updateDynamic("default")(default)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (variance != null) __obj.updateDynamic("variance")(variance)
    __obj.asInstanceOf[TypeParameter]
  }
}

