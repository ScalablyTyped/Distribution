package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait G10 extends StObject {
  
  var g10: ActiveDanger
  
  var g100: ActivePrimary
  
  var g90: ActiveLightUI
  
  var white: Active01
}
object G10 {
  
  inline def apply(g10: ActiveDanger, g100: ActivePrimary, g90: ActiveLightUI, white: Active01): G10 = {
    val __obj = js.Dynamic.literal(g10 = g10.asInstanceOf[js.Any], g100 = g100.asInstanceOf[js.Any], g90 = g90.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
    __obj.asInstanceOf[G10]
  }
  
  extension [Self <: G10](x: Self) {
    
    inline def setG10(value: ActiveDanger): Self = StObject.set(x, "g10", value.asInstanceOf[js.Any])
    
    inline def setG100(value: ActivePrimary): Self = StObject.set(x, "g100", value.asInstanceOf[js.Any])
    
    inline def setG90(value: ActiveLightUI): Self = StObject.set(x, "g90", value.asInstanceOf[js.Any])
    
    inline def setWhite(value: Active01): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
  }
}
