package typings.cswAasJs

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientRoleMod {
  
  @JSImport("csw-aas-js/dist/components/authorization/ClientRole", JSImport.Default)
  @js.native
  def default(hasClientRoleClientChildrenError: ClientRoleProps): Element = js.native
  
  @js.native
  trait ClientRoleProps extends StObject {
    
    var children: ReactNode = js.native
    
    var client: js.UndefOr[String] = js.native
    
    var clientRole: String = js.native
    
    var error: ReactNode = js.native
  }
  object ClientRoleProps {
    
    @scala.inline
    def apply(clientRole: String): ClientRoleProps = {
      val __obj = js.Dynamic.literal(clientRole = clientRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientRoleProps]
    }
    
    @scala.inline
    implicit class ClientRolePropsMutableBuilder[Self <: ClientRoleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientRole(value: String): Self = StObject.set(x, "clientRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}
