package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimatedTileLayerOptions extends StObject {
  
  /** A boolean that specifies whether the animation should auto-start when it is added to the map or not. Default: true **/
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  /** The number of miliseconds between two layer frames. Default: 1000 **/
  var frameRate: js.UndefOr[Double] = js.undefined
  
  /** A custom loading screen to show on the map when the map tiles are being fetched. **/
  var loadingScreen: js.UndefOr[CustomOverlay] = js.undefined
  
  /** The max amount of total loading time of all tiles in a viewport in milliseconds. Default: 15000 **/
  var maxTotalLoadTime: js.UndefOr[Double] = js.undefined
  
  /** The array of tile layer sources to animate through. **/
  var mercator: js.Array[TileSource]
  
  /** A boolean specifying if the animated tile layer is visible or not. **/
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IAnimatedTileLayerOptions {
  
  inline def apply(mercator: js.Array[TileSource]): IAnimatedTileLayerOptions = {
    val __obj = js.Dynamic.literal(mercator = mercator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimatedTileLayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAnimatedTileLayerOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setLoadingScreen(value: CustomOverlay): Self = StObject.set(x, "loadingScreen", value.asInstanceOf[js.Any])
    
    inline def setLoadingScreenUndefined: Self = StObject.set(x, "loadingScreen", js.undefined)
    
    inline def setMaxTotalLoadTime(value: Double): Self = StObject.set(x, "maxTotalLoadTime", value.asInstanceOf[js.Any])
    
    inline def setMaxTotalLoadTimeUndefined: Self = StObject.set(x, "maxTotalLoadTime", js.undefined)
    
    inline def setMercator(value: js.Array[TileSource]): Self = StObject.set(x, "mercator", value.asInstanceOf[js.Any])
    
    inline def setMercatorVarargs(value: TileSource*): Self = StObject.set(x, "mercator", js.Array(value*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
