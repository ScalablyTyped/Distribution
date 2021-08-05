package typings.connectEnsureLogin

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-ensure-login", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureLoggedIn(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureLoggedIn")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def ensureLoggedIn(options: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureLoggedIn")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def ensureLoggedIn(options: LoggedInOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureLoggedIn")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  inline def ensureLoggedOut(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureLoggedOut")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def ensureLoggedOut(options: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureLoggedOut")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def ensureLoggedOut(options: LoggedOutOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureLoggedOut")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  trait LoggedInOptions extends StObject {
    
    /**
      * URL to redirect to for login, defaults to _/login_
      */
    var redirectTo: js.UndefOr[String] = js.undefined
    
    /**
      * set redirectTo in session, defaults to _true_
      */
    var setRedirectTo: js.UndefOr[Boolean] = js.undefined
  }
  object LoggedInOptions {
    
    inline def apply(): LoggedInOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggedInOptions]
    }
    
    extension [Self <: LoggedInOptions](x: Self) {
      
      inline def setRedirectTo(value: String): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
      
      inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
      
      inline def setSetRedirectTo(value: Boolean): Self = StObject.set(x, "setRedirectTo", value.asInstanceOf[js.Any])
      
      inline def setSetRedirectToUndefined: Self = StObject.set(x, "setRedirectTo", js.undefined)
    }
  }
  
  trait LoggedOutOptions extends StObject {
    
    /**
      * URL to redirect to in logged in, defaults to _/_
      */
    var redirectTo: js.UndefOr[String] = js.undefined
  }
  object LoggedOutOptions {
    
    inline def apply(): LoggedOutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggedOutOptions]
    }
    
    extension [Self <: LoggedOutOptions](x: Self) {
      
      inline def setRedirectTo(value: String): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
      
      inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
    }
  }
}
