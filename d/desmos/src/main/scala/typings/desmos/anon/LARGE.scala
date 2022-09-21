package typings.desmos.anon

import typings.desmos.desmosStrings.MEDIUM
import typings.desmos.desmosStrings.SMALL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LARGE extends StObject {
  
  var LARGE: typings.desmos.desmosStrings.LARGE
  
  var MEDIUM: typings.desmos.desmosStrings.MEDIUM
  
  var SMALL: typings.desmos.desmosStrings.SMALL
}
object LARGE {
  
  inline def apply(): LARGE = {
    val __obj = js.Dynamic.literal(LARGE = "LARGE", MEDIUM = "MEDIUM", SMALL = "SMALL")
    __obj.asInstanceOf[LARGE]
  }
  
  extension [Self <: LARGE](x: Self) {
    
    inline def setLARGE(value: typings.desmos.desmosStrings.LARGE): Self = StObject.set(x, "LARGE", value.asInstanceOf[js.Any])
    
    inline def setMEDIUM(value: MEDIUM): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
    
    inline def setSMALL(value: SMALL): Self = StObject.set(x, "SMALL", value.asInstanceOf[js.Any])
  }
}
