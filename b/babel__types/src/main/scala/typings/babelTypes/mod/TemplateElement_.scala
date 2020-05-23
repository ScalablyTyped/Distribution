package typings.babelTypes.mod

import typings.babelTypes.anon.Cooked
import typings.babelTypes.babelTypesStrings.TemplateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateElement_
  extends BaseNode
     with _Node {
  var tail: Boolean
  @JSName("type")
  var type_TemplateElement_ : TemplateElement
  var value: Cooked
}

object TemplateElement_ {
  @scala.inline
  def apply(
    tail: Boolean,
    `type`: TemplateElement,
    value: Cooked,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TemplateElement_ = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateElement_]
  }
}

