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
    update: js.Function1[JulianDate, scala.Boolean]
  ): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changedEvent")(changedEvent)
    __obj.updateDynamic("clock")(clock)
    __obj.updateDynamic("clustering")(clustering)
    __obj.updateDynamic("entities")(entities)
    __obj.updateDynamic("errorEvent")(errorEvent)
    __obj.updateDynamic("isLoading")(isLoading)
    __obj.updateDynamic("loadingEvent")(loadingEvent)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[DataSource]
  }
}

