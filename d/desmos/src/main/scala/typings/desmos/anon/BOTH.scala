package typings.desmos.anon

import typings.desmos.desmosStrings.NONE
import typings.desmos.desmosStrings.POSITIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOTH extends StObject {
  
  var BOTH: typings.desmos.desmosStrings.BOTH
  
  var NONE: typings.desmos.desmosStrings.NONE
  
  var POSITIVE: typings.desmos.desmosStrings.POSITIVE
}
object BOTH {
  
  inline def apply(): BOTH = {
    val __obj = js.Dynamic.literal(BOTH = "BOTH", NONE = "NONE", POSITIVE = "POSITIVE")
    __obj.asInstanceOf[BOTH]
  }
  
  extension [Self <: BOTH](x: Self) {
    
    inline def setBOTH(value: typings.desmos.desmosStrings.BOTH): Self = StObject.set(x, "BOTH", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: NONE): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setPOSITIVE(value: POSITIVE): Self = StObject.set(x, "POSITIVE", value.asInstanceOf[js.Any])
  }
}
