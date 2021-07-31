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
  
  @scala.inline
  def default(hasChildrenError: CheckLoginProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenError.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CheckLoginProps extends StObject {
    
    var children: ReactNode
    
    var error: ReactNode
  }
  object CheckLoginProps {
    
    @scala.inline
    def apply(): CheckLoginProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckLoginProps]
    }
    
    @scala.inline
    implicit class CheckLoginPropsMutableBuilder[Self <: CheckLoginProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}
