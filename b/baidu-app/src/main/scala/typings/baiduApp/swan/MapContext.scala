package typings.baiduApp.swan

import typings.baiduApp.anon.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * mapContext 通过 mapId 跟一个 <map/> 组件绑定，通过它可以操作对应的 <map/> 组件。
  */
trait MapContext extends StObject {
  
  /**
    * 获取当前地图中心的经纬度，返回的是 gcj02 坐标系，可以用于 swan.openLocation
    */
  def getCenterLocation(options: GetCenterLocationOptions): OpenLocationOptions
  
  def getRegion(options: GetRegionOptions): Unit
  
  def includePoints(options: Padding): Unit
  
  /**
    * 将地图中心移动到当前定位点，需要配合map组件的show-location使用
    */
  def moveToLocation(): Unit
  
  def translateMarker(options: TranslateMarkerOptions): Unit
}
object MapContext {
  
  inline def apply(
    getCenterLocation: GetCenterLocationOptions => OpenLocationOptions,
    getRegion: GetRegionOptions => Unit,
    includePoints: Padding => Unit,
    moveToLocation: () => Unit,
    translateMarker: TranslateMarkerOptions => Unit
  ): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1(getCenterLocation), getRegion = js.Any.fromFunction1(getRegion), includePoints = js.Any.fromFunction1(includePoints), moveToLocation = js.Any.fromFunction0(moveToLocation), translateMarker = js.Any.fromFunction1(translateMarker))
    __obj.asInstanceOf[MapContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapContext] (val x: Self) extends AnyVal {
    
    inline def setGetCenterLocation(value: GetCenterLocationOptions => OpenLocationOptions): Self = StObject.set(x, "getCenterLocation", js.Any.fromFunction1(value))
    
    inline def setGetRegion(value: GetRegionOptions => Unit): Self = StObject.set(x, "getRegion", js.Any.fromFunction1(value))
    
    inline def setIncludePoints(value: Padding => Unit): Self = StObject.set(x, "includePoints", js.Any.fromFunction1(value))
    
    inline def setMoveToLocation(value: () => Unit): Self = StObject.set(x, "moveToLocation", js.Any.fromFunction0(value))
    
    inline def setTranslateMarker(value: TranslateMarkerOptions => Unit): Self = StObject.set(x, "translateMarker", js.Any.fromFunction1(value))
  }
}
