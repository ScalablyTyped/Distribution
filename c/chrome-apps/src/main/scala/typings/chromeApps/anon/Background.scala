package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: Scripts
}
object Background {
  
  inline def apply(background: Scripts): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  extension [Self <: Background](x: Self) {
    
    inline def setBackground(value: Scripts): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
  }
}
