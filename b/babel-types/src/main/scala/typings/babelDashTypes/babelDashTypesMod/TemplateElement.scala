package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.Anon_Cooked
import typings.babelDashTypes.Anon_CookedRaw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateElement extends Node {
  var tail: Boolean
  @JSName("type")
  var type_TemplateElement: typings.babelDashTypes.babelDashTypesStrings.TemplateElement
  var value: Anon_Cooked
}

object TemplateElement {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    tail: Boolean,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TemplateElement,
    value: Anon_Cooked,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateElement = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, tail = tail, value = value)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TemplateElement]
  }
}

@JSImport("babel-types", "templateElement")
@js.native
object templateElement extends js.Object {
  def apply(): TemplateElement = js.native
  def apply(value: Anon_CookedRaw): TemplateElement = js.native
  def apply(value: Anon_CookedRaw, tail: Boolean): TemplateElement = js.native
}

