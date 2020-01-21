package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.bg
import typings.blessed.blessedStrings.bottom
import typings.blessed.blessedStrings.center
import typings.blessed.blessedStrings.left
import typings.blessed.blessedStrings.line
import typings.blessed.blessedStrings.middle
import typings.blessed.blessedStrings.right
import typings.blessed.blessedStrings.top
import typings.blessed.mod.Widgets.Types.TPosition
import typings.blessed.mod.Widgets.Types.TTopLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementOptions extends INodeOptions {
  /**
    * Text alignment: left, center, or right.
    */
  var align: js.UndefOr[left | center | right] = js.undefined
  var bg: js.UndefOr[String] = js.undefined
  var bold: js.UndefOr[String] = js.undefined
  /**
    * Border object, see below.
    */
  var border: js.UndefOr[Border | line | bg] = js.undefined
  var bottom: js.UndefOr[TPosition] = js.undefined
  /**
    * Background character (default is whitespace ).
    */
  var ch: js.UndefOr[String] = js.undefined
  /**
    * Element is clickable.
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  /**
    * Element's text content.
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * Allow the element to be dragged with the mouse.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  var fg: js.UndefOr[String] = js.undefined
  /**
    * Element is focused.
    */
  var focused: js.UndefOr[BlessedElement] = js.undefined
  /**
    * Offsets of the element relative to its parent. Can be a number, percentage (0-100%), or
    * keyword (center). right and bottom do not accept keywords. Percentages can also have
    * offsets (50%+1, 50%-1).
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * Whether the element is hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * A floating text label for the element which appears on mouseover.
    */
  var hoverText: js.UndefOr[String] = js.undefined
  /**
    * Element is focusable and can receive key input.
    */
  var input: js.UndefOr[Boolean] = js.undefined
  var keyable: js.UndefOr[Boolean] = js.undefined
  /**
    * A simple text label for the element.
    */
  var label: js.UndefOr[String] = js.undefined
  var left: js.UndefOr[TTopLeft] = js.undefined
  /**
    * Amount of padding on the inside of the element. Can be a number or an object containing
    * the properties: left, right, top, and bottom.
    */
  var padding: js.UndefOr[Double | Padding] = js.undefined
  /**
    * Can contain the above options.
    */
  var position: js.UndefOr[Position] = js.undefined
  var right: js.UndefOr[TPosition] = js.undefined
  /**
    * Whether the element is scrollable or not.
    */
  var scrollable: js.UndefOr[Boolean] = js.undefined
  /**
    * Draw a translucent offset shadow behind the element.
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  /**
    * Shrink/flex/grow to content and child elements. Width/height during render.
    */
  var shrink: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var tags: js.UndefOr[Boolean] = js.undefined
  var top: js.UndefOr[TTopLeft] = js.undefined
  var underline: js.UndefOr[String] = js.undefined
  /**
    * Vertical text alignment: top, middle, or bottom.
    */
  var valign: js.UndefOr[top | middle | bottom] = js.undefined
  /**
    * Width/height of the element, can be a number, percentage (0-100%), or keyword (half or shrink).
    * Percentages can also have offsets (50%+1, 50%-1).
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object ElementOptions {
  @scala.inline
  def apply(
    align: left | center | right = null,
    bg: String = null,
    bold: String = null,
    border: Border | line | bg = null,
    bottom: TPosition = null,
    ch: String = null,
    children: js.Array[Node] = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fg: String = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    focused: BlessedElement = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hoverText: String = null,
    input: js.UndefOr[Boolean] = js.undefined,
    keyable: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    left: TTopLeft = null,
    name: String = null,
    padding: Double | Padding = null,
    parent: Node = null,
    position: Position = null,
    right: TPosition = null,
    screen: Screen = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    shadow: js.UndefOr[Boolean] = js.undefined,
    shrink: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    tags: js.UndefOr[Boolean] = js.undefined,
    top: TTopLeft = null,
    underline: String = null,
    valign: top | middle | bottom = null,
    width: Double | String = null
  ): ElementOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (ch != null) __obj.updateDynamic("ch")(ch.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (fg != null) __obj.updateDynamic("fg")(fg.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hoverText != null) __obj.updateDynamic("hoverText")(hoverText.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(keyable)) __obj.updateDynamic("keyable")(keyable.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(shrink)) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementOptions]
  }
}

