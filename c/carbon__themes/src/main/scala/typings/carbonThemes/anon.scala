package typings.carbonThemes

import typings.carbonThemes.mod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait G10 extends StObject {
    
    var g10: Theme
    
    var g100: Theme
    
    var g90: Theme
    
    var white: Theme
  }
  object G10 {
    
    inline def apply(g10: Theme, g100: Theme, g90: Theme, white: Theme): G10 = {
      val __obj = js.Dynamic.literal(g10 = g10.asInstanceOf[js.Any], g100 = g100.asInstanceOf[js.Any], g90 = g90.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
      __obj.asInstanceOf[G10]
    }
    
    extension [Self <: G10](x: Self) {
      
      inline def setG10(value: Theme): Self = StObject.set(x, "g10", value.asInstanceOf[js.Any])
      
      inline def setG100(value: Theme): Self = StObject.set(x, "g100", value.asInstanceOf[js.Any])
      
      inline def setG90(value: Theme): Self = StObject.set(x, "g90", value.asInstanceOf[js.Any])
      
      inline def setWhite(value: Theme): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    }
  }
}
