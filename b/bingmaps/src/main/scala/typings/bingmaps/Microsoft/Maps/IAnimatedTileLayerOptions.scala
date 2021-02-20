package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimatedTileLayerOptions extends StObject {
  
  /** A boolean that specifies whether the animation should auto-start when it is added to the map or not. Default: true **/
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  /** The number of miliseconds between two layer frames. Default: 1000 **/
  var frameRate: js.UndefOr[Double] = js.native
  
  /** A custom loading screen to show on the map when the map tiles are being fetched. **/
  var loadingScreen: js.UndefOr[CustomOverlay] = js.native
  
  /** The max amount of total loading time of all tiles in a viewport in milliseconds. Default: 15000 **/
  var maxTotalLoadTime: js.UndefOr[Double] = js.native
  
  /** The array of tile layer sources to animate through. **/
  var mercator: js.Array[TileSource] = js.native
  
  /** A boolean specifying if the animated tile layer is visible or not. **/
  var visible: js.UndefOr[Boolean] = js.native
}
object IAnimatedTileLayerOptions {
  
  @scala.inline
  def apply(mercator: js.Array[TileSource]): IAnimatedTileLayerOptions = {
    val __obj = js.Dynamic.literal(mercator = mercator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimatedTileLayerOptions]
  }
  
  @scala.inline
  implicit class IAnimatedTileLayerOptionsMutableBuilder[Self <: IAnimatedTileLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setLoadingScreen(value: CustomOverlay): Self = StObject.set(x, "loadingScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingScreenUndefined: Self = StObject.set(x, "loadingScreen", js.undefined)
    
    @scala.inline
    def setMaxTotalLoadTime(value: Double): Self = StObject.set(x, "maxTotalLoadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTotalLoadTimeUndefined: Self = StObject.set(x, "maxTotalLoadTime", js.undefined)
    
    @scala.inline
    def setMercator(value: js.Array[TileSource]): Self = StObject.set(x, "mercator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMercatorVarargs(value: TileSource*): Self = StObject.set(x, "mercator", js.Array(value :_*))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
