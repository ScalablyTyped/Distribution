package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXMemberExpression
  extends Node
     with Expression
     with JSX {
  var `object`: JSXMemberExpression | JSXIdentifier
  var property: JSXIdentifier
  @JSName("type")
  var type_JSXMemberExpression: babelDashTypesLib.babelDashTypesLibStrings.JSXMemberExpression
}

object JSXMemberExpression {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    `object`: JSXMemberExpression | JSXIdentifier,
    property: JSXIdentifier,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.JSXMemberExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXMemberExpression = {
    val __obj = js.Dynamic.literal(`object` = `object`.asInstanceOf[js.Any], `type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("property")(property)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXMemberExpression]
  }
}

