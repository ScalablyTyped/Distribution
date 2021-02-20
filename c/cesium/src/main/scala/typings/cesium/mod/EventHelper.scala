package typings.cesium.mod

import typings.cesium.mod.EventHelper.RemoveCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EventHelper")
@js.native
class EventHelper () extends StObject {
  
  def add(event: Event[js.Array[_]], listener: js.Function0[Unit]): RemoveCallback = js.native
  def add(event: Event[js.Array[_]], listener: js.Function0[Unit], scope: js.Any): RemoveCallback = js.native
  
  def removeAll(): Unit = js.native
}
object EventHelper {
  
  type RemoveCallback = js.Function0[Unit]
}
