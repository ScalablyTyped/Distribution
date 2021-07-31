package typings.cswAasJs

import typings.cswAasJs.authMod.Auth
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authContextMod {
  
  @JSImport("csw-aas-js/dist/components/context/AuthContext", "AuthContext")
  @js.native
  val AuthContext: Context[AuthContextType] = js.native
  
  /**
    * Default state for AuthContextProvider
    * @type {{auth: undefined, login: (function(): boolean), logout: (function(): boolean)}}
    */
  object AuthContextDefaultState {
    
    @JSImport("csw-aas-js/dist/components/context/AuthContext", "AuthContextDefaultState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("csw-aas-js/dist/components/context/AuthContext", "AuthContextDefaultState.auth")
    @js.native
    def auth: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any = js.native
    @scala.inline
    def auth_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auth")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def login(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("login")().asInstanceOf[Unit]
    
    @scala.inline
    def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(Consumer) */ @JSImport("csw-aas-js/dist/components/context/AuthContext", "Provider")
  @js.native
  val Provider: typings.react.mod.Provider[AuthContextType] = js.native
  
  trait AuthContextType extends StObject {
    
    var auth: Auth | Null
    
    def login(): Unit
    
    def logout(): Unit
  }
  object AuthContextType {
    
    @scala.inline
    def apply(login: () => Unit, logout: () => Unit): AuthContextType = {
      val __obj = js.Dynamic.literal(login = js.Any.fromFunction0(login), logout = js.Any.fromFunction0(logout), auth = null)
      __obj.asInstanceOf[AuthContextType]
    }
    
    @scala.inline
    implicit class AuthContextTypeMutableBuilder[Self <: AuthContextType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setLogin(value: () => Unit): Self = StObject.set(x, "login", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLogout(value: () => Unit): Self = StObject.set(x, "logout", js.Any.fromFunction0(value))
    }
  }
}
