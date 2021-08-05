package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.removeSubTapp()
trait RemoveSubTappConfig extends StObject {
  
  var close: Boolean
  
  var remove: Boolean
  
  var tappID: Double
}
object RemoveSubTappConfig {
  
  inline def apply(close: Boolean, remove: Boolean, tappID: Double): RemoveSubTappConfig = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], tappID = tappID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSubTappConfig]
  }
  
  extension [Self <: RemoveSubTappConfig](x: Self) {
    
    inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setTappID(value: Double): Self = StObject.set(x, "tappID", value.asInstanceOf[js.Any])
  }
}
