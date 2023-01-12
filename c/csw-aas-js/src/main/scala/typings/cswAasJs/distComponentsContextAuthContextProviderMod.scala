package typings.cswAasJs

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsContextAuthContextProviderMod {
  
  @JSImport("csw-aas-js/dist/components/context/AuthContextProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AuthContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait AuthContextConfig extends StObject {
    
    var clientId: String
    
    var realm: String
  }
  object AuthContextConfig {
    
    inline def apply(clientId: String, realm: String): AuthContextConfig = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthContextConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthContextConfig] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthContextProps extends StObject {
    
    var children: ReactNode
    
    var config: AuthContextConfig
  }
  object AuthContextProps {
    
    inline def apply(config: AuthContextConfig): AuthContextProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthContextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthContextProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setConfig(value: AuthContextConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
