package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveKeyString extends StObject {
  
  var activeKey: String
}
object ActiveKeyString {
  
  inline def apply(activeKey: String): ActiveKeyString = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveKeyString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveKeyString] (val x: Self) extends AnyVal {
    
    inline def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
  }
}
