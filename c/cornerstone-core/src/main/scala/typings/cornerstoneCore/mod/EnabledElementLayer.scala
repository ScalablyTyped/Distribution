package typings.cornerstoneCore.mod

import typings.cornerstoneCore.anon.Opacity
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnabledElementLayer extends StObject {
  
  /** The current canvas for this enabledElement */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  /** The DOM element which has been enabled for use by Cornerstone */
  var element: HTMLElement
  
  /** The image currently displayed in the enabledElement */
  var image: js.UndefOr[Image] = js.undefined
  
  /** Whether or not the image pixel data underlying the enabledElement has been changed, necessitating a redraw */
  var invalid: Boolean
  
  /** A flag for triggering a redraw of the canvas without re-retrieving the pixel data, since it remains valid */
  var needsRedraw: Boolean
  
  /** Layer drawing options */
  var options: js.UndefOr[Opacity] = js.undefined
  
  /** The current viewport settings of the enabledElement */
  var viewport: js.UndefOr[Viewport] = js.undefined
}
object EnabledElementLayer {
  
  inline def apply(element: HTMLElement, invalid: Boolean, needsRedraw: Boolean): EnabledElementLayer = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], needsRedraw = needsRedraw.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledElementLayer]
  }
  
  extension [Self <: EnabledElementLayer](x: Self) {
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setNeedsRedraw(value: Boolean): Self = StObject.set(x, "needsRedraw", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Opacity): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
