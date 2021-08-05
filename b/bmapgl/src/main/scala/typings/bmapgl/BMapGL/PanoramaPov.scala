package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaPov extends StObject {
  
  var heading: Double
  
  var pitch: Double
}
object PanoramaPov {
  
  inline def apply(heading: Double, pitch: Double): PanoramaPov = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaPov]
  }
  
  extension [Self <: PanoramaPov](x: Self) {
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
  }
}
