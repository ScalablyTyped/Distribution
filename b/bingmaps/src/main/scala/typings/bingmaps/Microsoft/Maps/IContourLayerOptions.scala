package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The contour layer options
  */
trait IContourLayerOptions extends StObject {
  
  /** A callback function which defines the color of the contour line fill. */
  var colorCallback: js.UndefOr[js.Function1[/* contourValue */ Double | String, String | Color]] = js.undefined
  
  /** The polygon options that apply to all contour lines of this layer */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.undefined
  
  /** Whether the layer is visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /** The z-index of this layer */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object IContourLayerOptions {
  
  inline def apply(): IContourLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContourLayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IContourLayerOptions] (val x: Self) extends AnyVal {
    
    inline def setColorCallback(value: /* contourValue */ Double | String => String | Color): Self = StObject.set(x, "colorCallback", js.Any.fromFunction1(value))
    
    inline def setColorCallbackUndefined: Self = StObject.set(x, "colorCallback", js.undefined)
    
    inline def setPolygonOptions(value: IPolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
    
    inline def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
