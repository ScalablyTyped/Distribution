package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapType extends StObject {
  
  def getMaxZoom(): Double
  
  def getMinZoom(): Double
  
  def getName(): String
  
  def getProjection(): Projection
  
  def getTextColor(): String
  
  def getTileLayer(): TileLayer
  
  def getTips(): String
}
object MapType {
  
  inline def apply(
    getMaxZoom: () => Double,
    getMinZoom: () => Double,
    getName: () => String,
    getProjection: () => Projection,
    getTextColor: () => String,
    getTileLayer: () => TileLayer,
    getTips: () => String
  ): MapType = {
    val __obj = js.Dynamic.literal(getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getName = js.Any.fromFunction0(getName), getProjection = js.Any.fromFunction0(getProjection), getTextColor = js.Any.fromFunction0(getTextColor), getTileLayer = js.Any.fromFunction0(getTileLayer), getTips = js.Any.fromFunction0(getTips))
    __obj.asInstanceOf[MapType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapType] (val x: Self) extends AnyVal {
    
    inline def setGetMaxZoom(value: () => Double): Self = StObject.set(x, "getMaxZoom", js.Any.fromFunction0(value))
    
    inline def setGetMinZoom(value: () => Double): Self = StObject.set(x, "getMinZoom", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetProjection(value: () => Projection): Self = StObject.set(x, "getProjection", js.Any.fromFunction0(value))
    
    inline def setGetTextColor(value: () => String): Self = StObject.set(x, "getTextColor", js.Any.fromFunction0(value))
    
    inline def setGetTileLayer(value: () => TileLayer): Self = StObject.set(x, "getTileLayer", js.Any.fromFunction0(value))
    
    inline def setGetTips(value: () => String): Self = StObject.set(x, "getTips", js.Any.fromFunction0(value))
  }
}
