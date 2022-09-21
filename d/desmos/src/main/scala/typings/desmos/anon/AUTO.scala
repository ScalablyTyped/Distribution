package typings.desmos.anon

import typings.desmos.desmosStrings.NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUTO extends StObject {
  
  var AUTO: typings.desmos.desmosStrings.AUTO
  
  var NONE: typings.desmos.desmosStrings.NONE
  
  var X: typings.desmos.desmosStrings.X
  
  var XY: typings.desmos.desmosStrings.XY
  
  var Y: typings.desmos.desmosStrings.Y
}
object AUTO {
  
  inline def apply(): AUTO = {
    val __obj = js.Dynamic.literal(AUTO = "AUTO", NONE = "NONE", X = "X", XY = "XY", Y = "Y")
    __obj.asInstanceOf[AUTO]
  }
  
  extension [Self <: AUTO](x: Self) {
    
    inline def setAUTO(value: typings.desmos.desmosStrings.AUTO): Self = StObject.set(x, "AUTO", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: NONE): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setX(value: typings.desmos.desmosStrings.X): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setXY(value: typings.desmos.desmosStrings.XY): Self = StObject.set(x, "XY", value.asInstanceOf[js.Any])
    
    inline def setY(value: typings.desmos.desmosStrings.Y): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
