package typings.css.cssMod

import typings.css.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyFrame extends Node {
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.undefined
  /** The list of "selectors" of the keyframe rule, split on commas. Each “selector” is trimmed from whitespace. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object KeyFrame {
  @scala.inline
  def apply(
    declarations: js.Array[Declaration | Comment] = null,
    parent: Node = null,
    position: Anon_Content = null,
    `type`: String = null,
    values: js.Array[String] = null
  ): KeyFrame = {
    val __obj = js.Dynamic.literal()
    if (declarations != null) __obj.updateDynamic("declarations")(declarations)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[KeyFrame]
  }
}

