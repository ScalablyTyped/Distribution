package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayer extends StObject {
  
  def getCopyright(): Copyright = js.native
  
  def getTilesUrl(tileCoord: Pixel, zoom: Double): String = js.native
  
  def isTransparentPng(): Boolean = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object TileLayer {
  
  @scala.inline
  def apply(
    getCopyright: () => Copyright,
    getTilesUrl: (Pixel, Double) => String,
    isTransparentPng: () => Boolean
  ): TileLayer = {
    val __obj = js.Dynamic.literal(getCopyright = js.Any.fromFunction0(getCopyright), getTilesUrl = js.Any.fromFunction2(getTilesUrl), isTransparentPng = js.Any.fromFunction0(isTransparentPng))
    __obj.asInstanceOf[TileLayer]
  }
  
  @scala.inline
  implicit class TileLayerMutableBuilder[Self <: TileLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCopyright(value: () => Copyright): Self = StObject.set(x, "getCopyright", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTilesUrl(value: (Pixel, Double) => String): Self = StObject.set(x, "getTilesUrl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsTransparentPng(value: () => Boolean): Self = StObject.set(x, "isTransparentPng", js.Any.fromFunction0(value))
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
