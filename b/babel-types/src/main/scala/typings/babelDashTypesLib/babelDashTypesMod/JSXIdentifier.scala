package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXIdentifier
  extends Node
     with Expression
     with JSX {
  var name: java.lang.String
  @JSName("type")
  var type_JSXIdentifier: babelDashTypesLib.babelDashTypesLibStrings.JSXIdentifier
}

object JSXIdentifier {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    name: java.lang.String,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.JSXIdentifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXIdentifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXIdentifier]
  }
}

