package typings.cswAasJs

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsAuthorizationRealmRoleMod {
  
  @JSImport("csw-aas-js/dist/components/authorization/RealmRole", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasRealmRoleChildrenError: RealmRoleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasRealmRoleChildrenError.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RealmRoleProps extends StObject {
    
    var children: ReactNode
    
    var error: ReactNode
    
    var realmRole: String
  }
  object RealmRoleProps {
    
    inline def apply(realmRole: String): RealmRoleProps = {
      val __obj = js.Dynamic.literal(realmRole = realmRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[RealmRoleProps]
    }
    
    extension [Self <: RealmRoleProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setRealmRole(value: String): Self = StObject.set(x, "realmRole", value.asInstanceOf[js.Any])
    }
  }
}
