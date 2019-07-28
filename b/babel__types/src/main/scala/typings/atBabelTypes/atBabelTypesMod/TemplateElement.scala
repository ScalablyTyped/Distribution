package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.Anon_Cooked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateElement
  extends BaseNode
     with _Node {
  var tail: Boolean
  @JSName("type")
  var type_TemplateElement: typings.atBabelTypes.atBabelTypesStrings.TemplateElement
  var value: Anon_Cooked
}

object TemplateElement {
  @scala.inline
  def apply(
    tail: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TemplateElement,
    value: Anon_Cooked,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail, value = value)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TemplateElement]
  }
}

