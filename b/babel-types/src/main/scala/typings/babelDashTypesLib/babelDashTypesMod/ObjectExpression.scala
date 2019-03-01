package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExpression
  extends Node
     with Expression {
  var properties: js.Array[ObjectProperty | ObjectMethod | SpreadProperty]
  @JSName("type")
  var type_ObjectExpression: babelDashTypesLib.babelDashTypesLibStrings.ObjectExpression
}

object ObjectExpression {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    properties: js.Array[ObjectProperty | ObjectMethod | SpreadProperty],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ObjectExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectExpression]
  }
}

