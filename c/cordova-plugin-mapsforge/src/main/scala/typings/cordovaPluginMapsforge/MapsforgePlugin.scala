package typings.cordovaPluginMapsforge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapsforgePlugin extends js.Object {
  var cache: MapsforgeCachePlugin = js.native
  var embedded: MapsforgeEmbeddedPlugin = js.native
}

object MapsforgePlugin {
  @scala.inline
  def apply(cache: MapsforgeCachePlugin, embedded: MapsforgeEmbeddedPlugin): MapsforgePlugin = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapsforgePlugin]
  }
  @scala.inline
  implicit class MapsforgePluginOps[Self <: MapsforgePlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCache(value: MapsforgeCachePlugin): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbedded(value: MapsforgeEmbeddedPlugin): Self = this.set("embedded", value.asInstanceOf[js.Any])
  }
  
}

