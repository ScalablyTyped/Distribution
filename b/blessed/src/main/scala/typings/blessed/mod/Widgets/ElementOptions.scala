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

@js.native
trait ElementOptions extends INodeOptions {
  /**
    * Text alignment: left, center, or right.
    */
  var align: js.UndefOr[left | center | right] = js.native
  var bg: js.UndefOr[String] = js.native
  var bold: js.UndefOr[String] = js.native
  /**
    * Border object, see below.
    */
  var border: js.UndefOr[Border | line | bg] = js.native
  var bottom: js.UndefOr[TPosition] = js.native
  /**
    * Background character (default is whitespace ).
    */
  var ch: js.UndefOr[String] = js.native
  /**
    * Element is clickable.
    */
  var clickable: js.UndefOr[Boolean] = js.native
  /**
    * Element's text content.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Allow the element to be dragged with the mouse.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  var fg: js.UndefOr[String] = js.native
  /**
    * Element is focused.
    */
  var focused: js.UndefOr[BlessedElement] = js.native
  /**
    * Offsets of the element relative to its parent. Can be a number, percentage (0-100%), or
    * keyword (center). right and bottom do not accept keywords. Percentages can also have
    * offsets (50%+1, 50%-1).
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Whether the element is hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * A floating text label for the element which appears on mouseover.
    */
  var hoverText: js.UndefOr[String] = js.native
  /**
    * Element is focusable and can receive key input.
    */
  var input: js.UndefOr[Boolean] = js.native
  var keyable: js.UndefOr[Boolean] = js.native
  /**
    * A simple text label for the element.
    */
  var label: js.UndefOr[String] = js.native
  var left: js.UndefOr[TTopLeft] = js.native
  /**
    * Amount of padding on the inside of the element. Can be a number or an object containing
    * the properties: left, right, top, and bottom.
    */
  var padding: js.UndefOr[Double | Padding] = js.native
  /**
    * Can contain the above options.
    */
  var position: js.UndefOr[Position] = js.native
  var right: js.UndefOr[TPosition] = js.native
  /**
    * Whether the element is scrollable or not.
    */
  var scrollable: js.UndefOr[Boolean] = js.native
  /**
    * Draw a translucent offset shadow behind the element.
    */
  var shadow: js.UndefOr[Boolean] = js.native
  /**
    * Shrink/flex/grow to content and child elements. Width/height during render.
    */
  var shrink: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var tags: js.UndefOr[Boolean] = js.native
  var top: js.UndefOr[TTopLeft] = js.native
  var underline: js.UndefOr[String] = js.native
  /**
    * Vertical text alignment: top, middle, or bottom.
    */
  var valign: js.UndefOr[top | middle | bottom] = js.native
  /**
    * Width/height of the element, can be a number, percentage (0-100%), or keyword (half or shrink).
    * Percentages can also have offsets (50%+1, 50%-1).
    */
  var width: js.UndefOr[Double | String] = js.native
}

object ElementOptions {
  @scala.inline
  def apply(): ElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementOptions]
  }
  @scala.inline
  implicit class ElementOptionsOps[Self <: ElementOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlign(value: left | center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBg(value: String): Self = this.set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    @scala.inline
    def setBold(value: String): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    @scala.inline
    def setBorder(value: Border | line | bg): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setBottom(value: TPosition): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setCh(value: String): Self = this.set("ch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCh: Self = this.set("ch", js.undefined)
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setFg(value: String): Self = this.set("fg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFg: Self = this.set("fg", js.undefined)
    @scala.inline
    def setFocused(value: BlessedElement): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHoverText(value: String): Self = this.set("hoverText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverText: Self = this.set("hoverText", js.undefined)
    @scala.inline
    def setInput(value: Boolean): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setKeyable(value: Boolean): Self = this.set("keyable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyable: Self = this.set("keyable", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLeft(value: TTopLeft): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setPadding(value: Double | Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRight(value: TPosition): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setShrink(value: Boolean): Self = this.set("shrink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrink: Self = this.set("shrink", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTags(value: Boolean): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTop(value: TTopLeft): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setUnderline(value: String): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    @scala.inline
    def setValign(value: top | middle | bottom): Self = this.set("valign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValign: Self = this.set("valign", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

