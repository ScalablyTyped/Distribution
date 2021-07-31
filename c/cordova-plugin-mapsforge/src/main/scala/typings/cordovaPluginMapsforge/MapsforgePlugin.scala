package typings.cordovaPluginMapsforge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapsforgePlugin extends StObject {
  
  var cache: MapsforgeCachePlugin
  
  var embedded: MapsforgeEmbeddedPlugin
}
object MapsforgePlugin {
  
  @scala.inline
  def apply(cache: MapsforgeCachePlugin, embedded: MapsforgeEmbeddedPlugin): MapsforgePlugin = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapsforgePlugin]
  }
  
  @scala.inline
  implicit class MapsforgePluginMutableBuilder[Self <: MapsforgePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: MapsforgeCachePlugin): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedded(value: MapsforgeEmbeddedPlugin): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
  }
}
