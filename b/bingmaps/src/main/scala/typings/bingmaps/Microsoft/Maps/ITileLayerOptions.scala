package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITileLayerOptions extends StObject {
  
  /**
    * The number of milliseconds allowed for the tile layer image download. If the timeout occurs before the image is fully
    * downloaded, the map control considers the download a failure. The default value is 10000.
    */
  var downloadTimeout: js.UndefOr[Double] = js.undefined
  
  /** Allow retrieving data from CORS supported server. */
  var enableCORS: js.UndefOr[Boolean] = js.undefined
  
  /** The tile source for the tile layer. */
  var mercator: js.UndefOr[TileSource] = js.undefined
  
  /** The opacity of the tile layer, defined by a number between 0 (not visible) and 1. */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /** Specifies that CORS should be made with the "use-credentials" flag instead of "anonymous". */
  var useCredentialsForCORS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean indicating whether to show or hide the tile layer. The default value is true. A value of false indicates that
    * the tile layer is hidden, although it is still an entity on the map.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /** The z-index of the tile layer. */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object ITileLayerOptions {
  
  inline def apply(): ITileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITileLayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITileLayerOptions] (val x: Self) extends AnyVal {
    
    inline def setDownloadTimeout(value: Double): Self = StObject.set(x, "downloadTimeout", value.asInstanceOf[js.Any])
    
    inline def setDownloadTimeoutUndefined: Self = StObject.set(x, "downloadTimeout", js.undefined)
    
    inline def setEnableCORS(value: Boolean): Self = StObject.set(x, "enableCORS", value.asInstanceOf[js.Any])
    
    inline def setEnableCORSUndefined: Self = StObject.set(x, "enableCORS", js.undefined)
    
    inline def setMercator(value: TileSource): Self = StObject.set(x, "mercator", value.asInstanceOf[js.Any])
    
    inline def setMercatorUndefined: Self = StObject.set(x, "mercator", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setUseCredentialsForCORS(value: Boolean): Self = StObject.set(x, "useCredentialsForCORS", value.asInstanceOf[js.Any])
    
    inline def setUseCredentialsForCORSUndefined: Self = StObject.set(x, "useCredentialsForCORS", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
