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
    destroy: () => scala.Unit,
    isDestroyed: () => scala.Boolean,
    scene: Scene,
    update: JulianDate => scala.Boolean
  ): DataSourceDisplay = {
    val __obj = js.Dynamic.literal(dataSources = dataSources, defaultDataSource = defaultDataSource, destroy = js.Any.fromFunction0(destroy), isDestroyed = js.Any.fromFunction0(isDestroyed), scene = scene, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DataSourceDisplay]
  }
}

