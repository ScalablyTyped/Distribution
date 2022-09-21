package typings.desmos.anon

import typings.desmos.desmosStrings.BELOW
import typings.desmos.desmosStrings.DEFAULT
import typings.desmos.desmosStrings.LEFT
import typings.desmos.desmosStrings.RIGHT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ABOVE extends StObject {
  
  var ABOVE: typings.desmos.desmosStrings.ABOVE
  
  var BELOW: typings.desmos.desmosStrings.BELOW
  
  var DEFAULT: typings.desmos.desmosStrings.DEFAULT
  
  var LEFT: typings.desmos.desmosStrings.LEFT
  
  var RIGHT: typings.desmos.desmosStrings.RIGHT
}
object ABOVE {
  
  inline def apply(): ABOVE = {
    val __obj = js.Dynamic.literal(ABOVE = "ABOVE", BELOW = "BELOW", DEFAULT = "DEFAULT", LEFT = "LEFT", RIGHT = "RIGHT")
    __obj.asInstanceOf[ABOVE]
  }
  
  extension [Self <: ABOVE](x: Self) {
    
    inline def setABOVE(value: typings.desmos.desmosStrings.ABOVE): Self = StObject.set(x, "ABOVE", value.asInstanceOf[js.Any])
    
    inline def setBELOW(value: BELOW): Self = StObject.set(x, "BELOW", value.asInstanceOf[js.Any])
    
    inline def setDEFAULT(value: DEFAULT): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setLEFT(value: LEFT): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setRIGHT(value: RIGHT): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
  }
}
