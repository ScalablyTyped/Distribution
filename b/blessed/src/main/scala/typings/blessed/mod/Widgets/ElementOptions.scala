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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementOptions
  extends StObject
     with INodeOptions {
  
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
  
  var style: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(): ElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementOptions]
  }
  
  extension [Self <: ElementOptions](x: Self) {
    
    inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setBorder(value: Border | line | bg): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setBottom(value: TPosition): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    inline def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
    
    inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
    
    inline def setFocused(value: BlessedElement): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHoverText(value: String): Self = StObject.set(x, "hoverText", value.asInstanceOf[js.Any])
    
    inline def setHoverTextUndefined: Self = StObject.set(x, "hoverText", js.undefined)
    
    inline def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setKeyable(value: Boolean): Self = StObject.set(x, "keyable", value.asInstanceOf[js.Any])
    
    inline def setKeyableUndefined: Self = StObject.set(x, "keyable", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLeft(value: TTopLeft): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setPadding(value: Double | Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRight(value: TPosition): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setShrink(value: Boolean): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTop(value: TTopLeft): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    inline def setValign(value: top | middle | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
