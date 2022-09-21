package typings.cytoscape.anon

import typings.cytoscape.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pan extends StObject {
  
  var pan: Position
  
  var zoom: Double
}
object Pan {
  
  inline def apply(pan: Position, zoom: Double): Pan = {
    val __obj = js.Dynamic.literal(pan = pan.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pan]
  }
  
  extension [Self <: Pan](x: Self) {
    
    inline def setPan(value: Position): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
