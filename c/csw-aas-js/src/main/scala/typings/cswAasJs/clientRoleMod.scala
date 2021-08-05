package typings.cswAasJs

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientRoleMod {
  
  @JSImport("csw-aas-js/dist/components/authorization/ClientRole", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasClientRoleClientChildrenError: ClientRoleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasClientRoleClientChildrenError.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ClientRoleProps extends StObject {
    
    var children: ReactNode
    
    var client: js.UndefOr[String] = js.undefined
    
    var clientRole: String
    
    var error: ReactNode
  }
  object ClientRoleProps {
    
    inline def apply(clientRole: String): ClientRoleProps = {
      val __obj = js.Dynamic.literal(clientRole = clientRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientRoleProps]
    }
    
    extension [Self <: ClientRoleProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientRole(value: String): Self = StObject.set(x, "clientRole", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}
