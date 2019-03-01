package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSTypeOperator
  extends TSType
     with BaseNode {
  var operator: java.lang.String | scala.Null
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSTypeOperator: atBabelTypesLib.atBabelTypesLibStrings.TSTypeOperator
}

object TSTypeOperator {
  @scala.inline
  def apply(
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSTypeOperator,
    typeAnnotation: TSType,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    operator: java.lang.String = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeOperator = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeOperator]
  }
}

