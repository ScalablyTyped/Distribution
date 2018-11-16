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

