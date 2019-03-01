package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXClosingElement
  extends Node
     with Immutable
     with JSX {
  var name: JSXIdentifier | JSXMemberExpression
  @JSName("type")
  var type_JSXClosingElement: babelDashTypesLib.babelDashTypesLibStrings.JSXClosingElement
}

object JSXClosingElement {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    name: JSXIdentifier | JSXMemberExpression,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.JSXClosingElement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXClosingElement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXClosingElement]
  }
}

