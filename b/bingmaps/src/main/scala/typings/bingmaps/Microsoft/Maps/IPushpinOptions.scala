package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPushpinOptions
  extends StObject
     with IPrimitiveOptions {
  
  /** The point on the pushpin icon, in pixels, which is anchored to the pushpin location. An anchor of (0,0) is the top left corner of the icon. */
  var anchor: js.UndefOr[Point] = js.undefined
  
  /** Specifies what color to make the default pushpin. */
  var color: js.UndefOr[String | Color] = js.undefined
  
  /** A boolean indicating whether the pushpin can be dragged to a new position with the mouse or by touch. */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies whether to enable the clicked style on the pushpin. */
  var enableClickedStyle: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies whether to enable the hover style on the pushpin. */
  var enableHoverStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the the icon to use for the pushpin.This can be a URL to an Image or SVG file, an image data URI, or an inline SVG string.
    * Tip: When using inline SVG, you can pass in placeholders `{color}` and `{text}` in your SVG string. This placeholder will be replaced by the pushpins color or text property value when rendered.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /** Whether the clickable area of pushpin should be an ellipse instead of a rectangle. */
  var roundClickableArea: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A secondary title label value to display under the pushpin. Uses label collision detection. This label automatically changes color between white
    * and dark grey depending on which map style is selected. Requires the title label to be set.
    */
  var subTitle: js.UndefOr[String] = js.undefined
  
  /** A short string of text that is overlaid on top of the pushpin. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The amount the text is shifted from the pushpin icon. The default value is (0,5). */
  var textOffset: js.UndefOr[Point] = js.undefined
  
  /**
    * The title label value to display under the pushpin. This label automatically changes color between white and dark grey depending on which map
    * style is selected. Pushpin Titles support label collision detection, as described below.
    */
  var title: js.UndefOr[String] = js.undefined
}
object IPushpinOptions {
  
  @scala.inline
  def apply(): IPushpinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPushpinOptions]
  }
  
  @scala.inline
  implicit class IPushpinOptionsMutableBuilder[Self <: IPushpinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setColor(value: String | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEnableClickedStyle(value: Boolean): Self = StObject.set(x, "enableClickedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableClickedStyleUndefined: Self = StObject.set(x, "enableClickedStyle", js.undefined)
    
    @scala.inline
    def setEnableHoverStyle(value: Boolean): Self = StObject.set(x, "enableHoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHoverStyleUndefined: Self = StObject.set(x, "enableHoverStyle", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setRoundClickableArea(value: Boolean): Self = StObject.set(x, "roundClickableArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundClickableAreaUndefined: Self = StObject.set(x, "roundClickableArea", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOffset(value: Point): Self = StObject.set(x, "textOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOffsetUndefined: Self = StObject.set(x, "textOffset", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
