package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaRoleDescCalMonth extends StObject {
  
  var ariaRoleDescCalMonth: String
}
object AriaRoleDescCalMonth {
  
  inline def apply(ariaRoleDescCalMonth: String): AriaRoleDescCalMonth = {
    val __obj = js.Dynamic.literal(ariaRoleDescCalMonth = ariaRoleDescCalMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaRoleDescCalMonth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaRoleDescCalMonth] (val x: Self) extends AnyVal {
    
    inline def setAriaRoleDescCalMonth(value: String): Self = StObject.set(x, "ariaRoleDescCalMonth", value.asInstanceOf[js.Any])
  }
}
