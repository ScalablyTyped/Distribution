package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXAttribute
  extends Node
     with Immutable
     with JSX {
  var name: JSXIdentifier | JSXNamespacedName
  @JSName("type")
  var type_JSXAttribute: babelDashTypesLib.babelDashTypesLibStrings.JSXAttribute
  var value: JSXElement | StringLiteral | JSXExpressionContainer | scala.Null
}

object JSXAttribute {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    name: JSXIdentifier | JSXNamespacedName,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.JSXAttribute,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    value: JSXElement | StringLiteral | JSXExpressionContainer = null
  ): JSXAttribute = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute]
  }
}

