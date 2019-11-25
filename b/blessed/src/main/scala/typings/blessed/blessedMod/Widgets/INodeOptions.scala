package typings.blessed.blessedMod.Widgets

import org.scalablytyped.runtime.StringDictionary
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
    StringDictionary: StringDictionary[js.Any] = null,
    children: js.Array[Node] = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    parent: Node = null,
    screen: Screen = null
  ): INodeOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeOptions]
  }
}

