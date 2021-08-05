package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heading extends StObject {
  
  var heading: Double
  
  var pitch: Double
  
  var roll: Double
}
object Heading {
  
  inline def apply(heading: Double, pitch: Double, roll: Double): Heading = {
    val __obj = js.Dynamic.literal(heading = heading.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heading]
  }
  
  extension [Self <: Heading](x: Self) {
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
  }
}
