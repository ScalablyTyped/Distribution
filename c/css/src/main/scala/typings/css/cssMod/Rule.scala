package typings.css.cssMod

import typings.css.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends Node {
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.undefined
  /** The list of selectors of the rule, split on commas. Each selector is trimmed from whitespace and comments. */
  var selectors: js.UndefOr[js.Array[String]] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    declarations: js.Array[Declaration | Comment] = null,
    parent: Node = null,
    position: Anon_Content = null,
    selectors: js.Array[String] = null,
    `type`: String = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (declarations != null) __obj.updateDynamic("declarations")(declarations)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Rule]
  }
}

