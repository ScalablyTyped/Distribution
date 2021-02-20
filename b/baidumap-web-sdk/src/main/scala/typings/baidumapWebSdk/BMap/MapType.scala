package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapType extends StObject {
  
  def getMaxZoom(): Double = js.native
  
  def getMinZoom(): Double = js.native
  
  def getName(): String = js.native
  
  def getProjection(): Projection = js.native
  
  def getTextColor(): String = js.native
  
  def getTileLayer(): TileLayer = js.native
  
  def getTips(): String = js.native
}
object MapType {
  
  @scala.inline
  def apply(
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
  implicit class MapTypeMutableBuilder[Self <: MapType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMaxZoom(value: () => Double): Self = StObject.set(x, "getMaxZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinZoom(value: () => Double): Self = StObject.set(x, "getMinZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProjection(value: () => Projection): Self = StObject.set(x, "getProjection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextColor(value: () => String): Self = StObject.set(x, "getTextColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTileLayer(value: () => TileLayer): Self = StObject.set(x, "getTileLayer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTips(value: () => String): Self = StObject.set(x, "getTips", js.Any.fromFunction0(value))
  }
}
