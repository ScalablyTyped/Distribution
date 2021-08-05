package typings.bootbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootboxLocaleValues extends StObject {
  
  var CANCEL: String
  
  var CONFIRM: String
  
  var OK: String
}
object BootboxLocaleValues {
  
  inline def apply(CANCEL: String, CONFIRM: String, OK: String): BootboxLocaleValues = {
    val __obj = js.Dynamic.literal(CANCEL = CANCEL.asInstanceOf[js.Any], CONFIRM = CONFIRM.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxLocaleValues]
  }
  
  extension [Self <: BootboxLocaleValues](x: Self) {
    
    inline def setCANCEL(value: String): Self = StObject.set(x, "CANCEL", value.asInstanceOf[js.Any])
    
    inline def setCONFIRM(value: String): Self = StObject.set(x, "CONFIRM", value.asInstanceOf[js.Any])
    
    inline def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
  }
}
