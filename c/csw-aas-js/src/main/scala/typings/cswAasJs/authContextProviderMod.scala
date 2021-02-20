package typings.cswAasJs

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authContextProviderMod {
  
  @JSImport("csw-aas-js/dist/components/context/AuthContextProvider", JSImport.Default)
  @js.native
  def default(props: AuthContextProps): Element = js.native
  
  @js.native
  trait AuthContextConfig extends StObject {
    
    var clientId: String = js.native
    
    var realm: String = js.native
  }
  object AuthContextConfig {
    
    @scala.inline
    def apply(clientId: String, realm: String): AuthContextConfig = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthContextConfig]
    }
    
    @scala.inline
    implicit class AuthContextConfigMutableBuilder[Self <: AuthContextConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthContextProps extends StObject {
    
    var children: ReactNode = js.native
    
    var config: AuthContextConfig = js.native
  }
  object AuthContextProps {
    
    @scala.inline
    def apply(config: AuthContextConfig): AuthContextProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthContextProps]
    }
    
    @scala.inline
    implicit class AuthContextPropsMutableBuilder[Self <: AuthContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setConfig(value: AuthContextConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
