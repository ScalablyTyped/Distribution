package typings.cordovaPluginMapsforge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var mapsforge: MapsforgePlugin
}
object Window {
  
  inline def apply(mapsforge: MapsforgePlugin): Window = {
    val __obj = js.Dynamic.literal(mapsforge = mapsforge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setMapsforge(value: MapsforgePlugin): Self = StObject.set(x, "mapsforge", value.asInstanceOf[js.Any])
  }
}
