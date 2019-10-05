package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeOptions extends IOptions {
  var children: js.UndefOr[js.Array[Node]] = js.undefined
  var focusable: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Node] = js.undefined
  var screen: js.UndefOr[Screen] = js.undefined
}

object INodeOptions {
  @scala.inline
  def apply(
    children: js.Array[Node] = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    parent: Node = null,
    screen: Screen = null
  ): INodeOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (screen != null) __obj.updateDynamic("screen")(screen)
    __obj.asInstanceOf[INodeOptions]
  }
}

