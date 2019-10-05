package typings.blessed.blessedMod.Widgets

import typings.blessed.Anon_Ch
import typings.blessed.blessedMod.Widgets.Types.TPosition
import typings.blessed.blessedMod.Widgets.Types.TTopLeft
import typings.blessed.blessedStrings.bg
import typings.blessed.blessedStrings.bottom
import typings.blessed.blessedStrings.center
import typings.blessed.blessedStrings.left
import typings.blessed.blessedStrings.line
import typings.blessed.blessedStrings.middle
import typings.blessed.blessedStrings.right
import typings.blessed.blessedStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerOptions extends ListOptions[ListElementStyle] {
  /**
    * Current working directory.
    */
  var cwd: js.UndefOr[String] = js.undefined
}

object FileManagerOptions {
  @scala.inline
  def apply(
    align: left | center | right = null,
    alwaysScroll: js.UndefOr[Boolean] = js.undefined,
    baseLimit: Int | Double = null,
    bg: String = null,
    bindings: js.Any = null,
    bold: String = null,
    border: Border | line | bg = null,
    bottom: TPosition = null,
    ch: String = null,
    children: js.Array[Node] = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    cwd: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fg: String = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    focused: BlessedElement = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hoverText: String = null,
    input: js.UndefOr[Boolean] = js.undefined,
    interactive: js.UndefOr[Boolean] = js.undefined,
    invertSelected: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[String] = null,
    keyable: js.UndefOr[Boolean] = js.undefined,
    keys: String | js.Array[String] | Boolean = null,
    label: String = null,
    left: TTopLeft = null,
    mouse: Boolean | js.Function0[Unit] = null,
    name: String = null,
    padding: Double | Padding = null,
    parent: Node = null,
    position: Position = null,
    right: TPosition = null,
    screen: Screen = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    scrollbar: Anon_Ch = null,
    search: (/* err */ js.Any, /* value */ js.UndefOr[String]) => Unit = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    shrink: js.UndefOr[Boolean] = js.undefined,
    style: ListElementStyle = null,
    tags: js.UndefOr[Boolean] = js.undefined,
    top: TTopLeft = null,
    underline: String = null,
    valign: top | middle | bottom = null,
    vi: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): FileManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysScroll)) __obj.updateDynamic("alwaysScroll")(alwaysScroll)
    if (baseLimit != null) __obj.updateDynamic("baseLimit")(baseLimit.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (bold != null) __obj.updateDynamic("bold")(bold)
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (ch != null) __obj.updateDynamic("ch")(ch)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (content != null) __obj.updateDynamic("content")(content)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (fg != null) __obj.updateDynamic("fg")(fg)
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hoverText != null) __obj.updateDynamic("hoverText")(hoverText)
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(invertSelected)) __obj.updateDynamic("invertSelected")(invertSelected)
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(keyable)) __obj.updateDynamic("keyable")(keyable)
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (mouse != null) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen)
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar)
    if (search != null) __obj.updateDynamic("search")(js.Any.fromFunction2(search))
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow)
    if (!js.isUndefined(shrink)) __obj.updateDynamic("shrink")(shrink)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline)
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (!js.isUndefined(vi)) __obj.updateDynamic("vi")(vi)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerOptions]
  }
}

