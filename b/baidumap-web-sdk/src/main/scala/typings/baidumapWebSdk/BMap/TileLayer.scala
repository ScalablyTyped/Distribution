package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayer extends StObject {
  
  def getCopyright(): Copyright
  
  def getTilesUrl(tileCoord: Pixel, zoom: Double): String
  
  def isTransparentPng(): Boolean
}
object TileLayer {
  
  inline def apply(
    getCopyright: () => Copyright,
    getTilesUrl: (Pixel, Double) => String,
    isTransparentPng: () => Boolean
  ): TileLayer = {
    val __obj = js.Dynamic.literal(getCopyright = js.Any.fromFunction0(getCopyright), getTilesUrl = js.Any.fromFunction2(getTilesUrl), isTransparentPng = js.Any.fromFunction0(isTransparentPng))
    __obj.asInstanceOf[TileLayer]
  }
  
  extension [Self <: TileLayer](x: Self) {
    
    inline def setGetCopyright(value: () => Copyright): Self = StObject.set(x, "getCopyright", js.Any.fromFunction0(value))
    
    inline def setGetTilesUrl(value: (Pixel, Double) => String): Self = StObject.set(x, "getTilesUrl", js.Any.fromFunction2(value))
    
    inline def setIsTransparentPng(value: () => Boolean): Self = StObject.set(x, "isTransparentPng", js.Any.fromFunction0(value))
  }
}
