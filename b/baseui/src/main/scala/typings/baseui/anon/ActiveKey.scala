package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveKey extends StObject {
  
  var activeKey: typings.react.mod.Key
}
object ActiveKey {
  
  inline def apply(activeKey: typings.react.mod.Key): ActiveKey = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveKey] (val x: Self) extends AnyVal {
    
    inline def setActiveKey(value: typings.react.mod.Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
  }
}
