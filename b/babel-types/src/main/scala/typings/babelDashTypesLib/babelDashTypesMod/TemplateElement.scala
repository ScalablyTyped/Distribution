package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateElement extends Node {
  var tail: scala.Boolean
  @JSName("type")
  var type_TemplateElement: babelDashTypesLib.babelDashTypesLibStrings.TemplateElement
  var value: babelDashTypesLib.Anon_Cooked
}

object TemplateElement {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    tail: scala.Boolean,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TemplateElement,
    value: babelDashTypesLib.Anon_Cooked,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateElement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("tail")(tail)
    __obj.updateDynamic("value")(value)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TemplateElement]
  }
}

