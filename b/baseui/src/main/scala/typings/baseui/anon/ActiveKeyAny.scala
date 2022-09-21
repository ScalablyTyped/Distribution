package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveKeyAny extends StObject {
  
  var activeKey: Any
}
object ActiveKeyAny {
  
  inline def apply(activeKey: Any): ActiveKeyAny = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveKeyAny]
  }
  
  extension [Self <: ActiveKeyAny](x: Self) {
    
    inline def setActiveKey(value: Any): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
  }
}
