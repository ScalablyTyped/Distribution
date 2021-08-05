package typings.cswAasJs

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkLoginMod {
  
  @JSImport("csw-aas-js/dist/components/authentication/CheckLogin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildrenError: CheckLoginProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenError.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CheckLoginProps extends StObject {
    
    var children: ReactNode
    
    var error: ReactNode
  }
  object CheckLoginProps {
    
    inline def apply(): CheckLoginProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckLoginProps]
    }
    
    extension [Self <: CheckLoginProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}
