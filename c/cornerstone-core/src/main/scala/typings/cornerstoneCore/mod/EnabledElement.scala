package typings.cornerstoneCore.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnabledElement extends StObject {
  
  /** The current canvas for this enabledElement */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  /** The DOM element which has been enabled for use by Cornerstone */
  var element: HTMLElement
  
  /** The image currently displayed in the enabledElement */
  var image: js.UndefOr[Image] = js.undefined
  
  /** Whether or not the image pixel data underlying the enabledElement has been changed, necessitating a redraw */
  var invalid: Boolean
  
  /** The previous state for the sync viewport boolean */
  var lastSyncViewportsState: js.UndefOr[Boolean] = js.undefined
  
  /** The layers that have been added to the enabledElement */
  var layers: js.UndefOr[js.Array[EnabledElementLayer]] = js.undefined
  
  /** A flag for triggering a redraw of the canvas without re-retrieving the pixel data, since it remains valid */
  var needsRedraw: Boolean
  
  /** Whether or not to synchronize the viewport parameters for each of the enabled element's layers */
  var syncViewports: js.UndefOr[Boolean] = js.undefined
  
  /** The current viewport settings of the enabledElement */
  var viewport: js.UndefOr[Viewport] = js.undefined
}
object EnabledElement {
  
  inline def apply(element: HTMLElement, invalid: Boolean, needsRedraw: Boolean): EnabledElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], needsRedraw = needsRedraw.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnabledElement] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setLastSyncViewportsState(value: Boolean): Self = StObject.set(x, "lastSyncViewportsState", value.asInstanceOf[js.Any])
    
    inline def setLastSyncViewportsStateUndefined: Self = StObject.set(x, "lastSyncViewportsState", js.undefined)
    
    inline def setLayers(value: js.Array[EnabledElementLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: EnabledElementLayer*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setNeedsRedraw(value: Boolean): Self = StObject.set(x, "needsRedraw", value.asInstanceOf[js.Any])
    
    inline def setSyncViewports(value: Boolean): Self = StObject.set(x, "syncViewports", value.asInstanceOf[js.Any])
    
    inline def setSyncViewportsUndefined: Self = StObject.set(x, "syncViewports", js.undefined)
    
    inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
