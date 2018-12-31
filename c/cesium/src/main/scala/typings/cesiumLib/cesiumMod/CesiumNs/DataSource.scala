package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  var changedEvent: Event
  var clock: DataSourceClock
  var clustering: EntityCluster
  var entities: EntityCollection
  var errorEvent: Event
  var isLoading: scala.Boolean
  var loadingEvent: Event
  var name: java.lang.String
  var show: scala.Boolean
  def update(time: JulianDate): scala.Boolean
}

