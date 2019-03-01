package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateElement
  extends BaseNode
     with _Node {
  var tail: scala.Boolean
  @JSName("type")
  var type_TemplateElement: atBabelTypesLib.atBabelTypesLibStrings.TemplateElement
  var value: js.Any
}

object TemplateElement {
  @scala.inline
  def apply(
    tail: scala.Boolean,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TemplateElement,
    value: js.Any,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateElement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("tail")(tail)
    __obj.updateDynamic("value")(value)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TemplateElement]
  }
}

