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

object DataSource {
  @scala.inline
  def apply(
    changedEvent: Event,
    clock: DataSourceClock,
    clustering: EntityCluster,
    entities: EntityCollection,
    errorEvent: Event,
    isLoading: scala.Boolean,
    loadingEvent: Event,
    name: java.lang.String,
    show: scala.Boolean,
    update: JulianDate => scala.Boolean
  ): DataSource = {
    val __obj = js.Dynamic.literal(changedEvent = changedEvent, clock = clock, clustering = clustering, entities = entities, errorEvent = errorEvent, isLoading = isLoading, loadingEvent = loadingEvent, name = name, show = show, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DataSource]
  }
}

