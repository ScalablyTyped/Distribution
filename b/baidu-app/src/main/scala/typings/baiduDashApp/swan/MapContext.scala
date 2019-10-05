package typings.baiduDashApp.swan

import typings.baiduDashApp.Anon_Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * mapContext 通过 mapId 跟一个 <map/> 组件绑定，通过它可以操作对应的 <map/> 组件。
	 */
trait MapContext extends js.Object {
  /**
  		 * 获取当前地图中心的经纬度，返回的是 gcj02 坐标系，可以用于 swan.openLocation
  		 */
  def getCenterLocation(options: GetCenterLocationOptions): OpenLocationOptions
  def getRegion(options: GetRegionOptions): Unit
  def includePoints(options: Anon_Padding): Unit
  /**
  		 * 将地图中心移动到当前定位点，需要配合map组件的show-location使用
  		 */
  def moveToLocation(): Unit
  def translateMarker(options: TranslateMarkerOptions): Unit
}

object MapContext {
  @scala.inline
  def apply(
    getCenterLocation: GetCenterLocationOptions => OpenLocationOptions,
    getRegion: GetRegionOptions => Unit,
    includePoints: Anon_Padding => Unit,
    moveToLocation: () => Unit,
    translateMarker: TranslateMarkerOptions => Unit
  ): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1(getCenterLocation), getRegion = js.Any.fromFunction1(getRegion), includePoints = js.Any.fromFunction1(includePoints), moveToLocation = js.Any.fromFunction0(moveToLocation), translateMarker = js.Any.fromFunction1(translateMarker))
  
    __obj.asInstanceOf[MapContext]
  }
}

