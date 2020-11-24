package typings.cesium.mod

import typings.cesium.mod.EventHelper.RemoveCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
