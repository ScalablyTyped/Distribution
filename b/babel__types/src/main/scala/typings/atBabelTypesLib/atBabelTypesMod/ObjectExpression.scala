package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ObjectExpression
  extends Expression
     with BaseNode {
  var properties: js.Array[ObjectMethod | ObjectProperty | SpreadElement]
  @JSName("type")
  var type_ObjectExpression: atBabelTypesLib.atBabelTypesLibStrings.ObjectExpression
}

object ObjectExpression {
  @scala.inline
  def apply(
    properties: js.Array[ObjectMethod | ObjectProperty | SpreadElement],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ObjectExpression,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("properties")(properties)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectExpression]
  }
}

