package typings.cesium.cesiumMod

import typings.cesium.cesiumMod.EventHelper.RemoveCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EventHelper")
@js.native
class EventHelper () extends js.Object {
  def add(event: Event[js.Array[_]], listener: js.Function0[Unit]): RemoveCallback = js.native
  def add(event: Event[js.Array[_]], listener: js.Function0[Unit], scope: js.Any): RemoveCallback = js.native
  def removeAll(): Unit = js.native
}

@JSImport("cesium", "EventHelper")
@js.native
object EventHelper extends js.Object {
  type RemoveCallback = js.Function0[Unit]
}

