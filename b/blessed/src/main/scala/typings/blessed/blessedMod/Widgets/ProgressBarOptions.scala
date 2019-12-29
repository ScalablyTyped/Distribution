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

trait ProgressBarOptions extends BoxOptions {
  /**
    * the amount filled (0 - 100).
    */
  var filled: js.UndefOr[Double] = js.undefined
  /**
    * enable key support.
    */
  @JSName("keys")
  var keys_ProgressBarOptions: js.UndefOr[Boolean] = js.undefined
  /**
    * enable mouse support.
    */
  @JSName("mouse")
  var mouse_ProgressBarOptions: js.UndefOr[Boolean] = js.undefined
  /**
    * can be `horizontal` or `vertical`.
    */
  var orientation: js.UndefOr[String] = js.undefined
  /**
    * the character to fill the bar with (default is space).
    */
  var pch: js.UndefOr[String] = js.undefined
  /**
    * same as `filled`.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object ProgressBarOptions {
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
    draggable: js.UndefOr[Boolean] = js.undefined,
    fg: String = null,
    filled: Int | Double = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    focused: BlessedElement = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hoverText: String = null,
    input: js.UndefOr[Boolean] = js.undefined,
    keyable: js.UndefOr[Boolean] = js.undefined,
    keys: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    left: TTopLeft = null,
    mouse: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    orientation: String = null,
    padding: Double | Padding = null,
    parent: Node = null,
    pch: String = null,
    position: Position = null,
    right: TPosition = null,
    screen: Screen = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    scrollbar: Anon_Ch = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    shrink: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    tags: js.UndefOr[Boolean] = js.undefined,
    top: TTopLeft = null,
    underline: String = null,
    valign: top | middle | bottom = null,
    value: Int | Double = null,
    vi: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysScroll)) __obj.updateDynamic("alwaysScroll")(alwaysScroll.asInstanceOf[js.Any])
    if (baseLimit != null) __obj.updateDynamic("baseLimit")(baseLimit.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (ch != null) __obj.updateDynamic("ch")(ch.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (fg != null) __obj.updateDynamic("fg")(fg.asInstanceOf[js.Any])
    if (filled != null) __obj.updateDynamic("filled")(filled.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hoverText != null) __obj.updateDynamic("hoverText")(hoverText.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(keyable)) __obj.updateDynamic("keyable")(keyable.asInstanceOf[js.Any])
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(mouse)) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (pch != null) __obj.updateDynamic("pch")(pch.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(shrink)) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vi)) __obj.updateDynamic("vi")(vi.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
}

