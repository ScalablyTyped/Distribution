package typings.cordovaPluginMapsforge

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
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapsforgePlugin]
  }
}

