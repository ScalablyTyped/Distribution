package typings.chevrotainCstDtsGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<@chevrotain/types.@chevrotain/types.GenerateDtsOptions> */
  trait RequiredGenerateDtsOption extends StObject {
    
    var includeVisitorInterface: Boolean
    
    var visitorInterfaceName: String
  }
  object RequiredGenerateDtsOption {
    
    inline def apply(includeVisitorInterface: Boolean, visitorInterfaceName: String): RequiredGenerateDtsOption = {
      val __obj = js.Dynamic.literal(includeVisitorInterface = includeVisitorInterface.asInstanceOf[js.Any], visitorInterfaceName = visitorInterfaceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredGenerateDtsOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredGenerateDtsOption] (val x: Self) extends AnyVal {
      
      inline def setIncludeVisitorInterface(value: Boolean): Self = StObject.set(x, "includeVisitorInterface", value.asInstanceOf[js.Any])
      
      inline def setVisitorInterfaceName(value: String): Self = StObject.set(x, "visitorInterfaceName", value.asInstanceOf[js.Any])
    }
  }
}
