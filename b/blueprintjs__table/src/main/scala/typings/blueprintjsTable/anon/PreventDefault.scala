package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventDefault extends StObject {
  
  var preventDefault: Boolean
  
  var stopPropagation: Boolean
}
object PreventDefault {
  
  inline def apply(preventDefault: Boolean, stopPropagation: Boolean): PreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventDefault]
  }
  
  extension [Self <: PreventDefault](x: Self) {
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
  }
}
