package typings.cordovaPluginMapsforge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var mapsforge: MapsforgePlugin = js.native
}
object Window {
  
  @scala.inline
  def apply(mapsforge: MapsforgePlugin): Window = {
    val __obj = js.Dynamic.literal(mapsforge = mapsforge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapsforge(value: MapsforgePlugin): Self = StObject.set(x, "mapsforge", value.asInstanceOf[js.Any])
  }
}
