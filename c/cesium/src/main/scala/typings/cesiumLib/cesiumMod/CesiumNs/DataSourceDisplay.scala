package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceDisplay extends js.Object {
  var dataSources: DataSourceCollection
  var defaultDataSource: CustomDataSource
  var scene: Scene
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def update(time: JulianDate): scala.Boolean
}

object DataSourceDisplay {
  @scala.inline
  def apply(
    dataSources: DataSourceCollection,
    defaultDataSource: CustomDataSource,
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    scene: Scene,
    update: js.Function1[JulianDate, scala.Boolean]
  ): DataSourceDisplay = {
    val __obj = js.Dynamic.literal(dataSources = dataSources, defaultDataSource = defaultDataSource, destroy = destroy, isDestroyed = isDestroyed, scene = scene, update = update)
  
    __obj.asInstanceOf[DataSourceDisplay]
  }
}

