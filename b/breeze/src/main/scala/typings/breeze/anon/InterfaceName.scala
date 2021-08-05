package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterfaceName extends StObject {
  
  var interfaceName: String
  
  var isDefault: Boolean
}
object InterfaceName {
  
  inline def apply(interfaceName: String, isDefault: Boolean): InterfaceName = {
    val __obj = js.Dynamic.literal(interfaceName = interfaceName.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceName]
  }
  
  extension [Self <: InterfaceName](x: Self) {
    
    inline def setInterfaceName(value: String): Self = StObject.set(x, "interfaceName", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
  }
}
