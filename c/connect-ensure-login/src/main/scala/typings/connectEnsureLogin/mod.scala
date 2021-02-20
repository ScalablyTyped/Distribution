package typings.connectEnsureLogin

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-ensure-login", "ensureLoggedIn")
  @js.native
  def ensureLoggedIn(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("connect-ensure-login", "ensureLoggedIn")
  @js.native
  def ensureLoggedIn(options: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("connect-ensure-login", "ensureLoggedIn")
  @js.native
  def ensureLoggedIn(options: LoggedInOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("connect-ensure-login", "ensureLoggedOut")
  @js.native
  def ensureLoggedOut(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("connect-ensure-login", "ensureLoggedOut")
  @js.native
  def ensureLoggedOut(options: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("connect-ensure-login", "ensureLoggedOut")
  @js.native
  def ensureLoggedOut(options: LoggedOutOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait LoggedInOptions extends StObject {
    
    /**
      * URL to redirect to for login, defaults to _/login_
      */
    var redirectTo: js.UndefOr[String] = js.native
    
    /**
      * set redirectTo in session, defaults to _true_
      */
    var setRedirectTo: js.UndefOr[Boolean] = js.native
  }
  object LoggedInOptions {
    
    @scala.inline
    def apply(): LoggedInOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggedInOptions]
    }
    
    @scala.inline
    implicit class LoggedInOptionsMutableBuilder[Self <: LoggedInOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirectTo(value: String): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
      
      @scala.inline
      def setSetRedirectTo(value: Boolean): Self = StObject.set(x, "setRedirectTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetRedirectToUndefined: Self = StObject.set(x, "setRedirectTo", js.undefined)
    }
  }
  
  @js.native
  trait LoggedOutOptions extends StObject {
    
    /**
      * URL to redirect to in logged in, defaults to _/_
      */
    var redirectTo: js.UndefOr[String] = js.native
  }
  object LoggedOutOptions {
    
    @scala.inline
    def apply(): LoggedOutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggedOutOptions]
    }
    
    @scala.inline
    implicit class LoggedOutOptionsMutableBuilder[Self <: LoggedOutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirectTo(value: String): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
    }
  }
}
