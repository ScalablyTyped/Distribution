package typings
package cordovaDashPluginDashMapsforgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapsforgePlugin extends js.Object {
  var cache: MapsforgeCachePlugin
  var embedded: MapsforgeEmbeddedPlugin
}

object MapsforgePlugin {
  @scala.inline
  def apply(cache: MapsforgeCachePlugin, embedded: MapsforgeEmbeddedPlugin): MapsforgePlugin = {
    val __obj = js.Dynamic.literal(cache = cache, embedded = embedded)
  
    __obj.asInstanceOf[MapsforgePlugin]
  }
}

