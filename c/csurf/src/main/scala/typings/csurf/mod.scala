package typings.csurf

import typings.csurf.anon.Cookie
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]]
  @scala.inline
  def apply(options: Cookie): RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]]
  
  @JSImport("csurf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CookieOptions
    extends StObject
       with typings.expressServeStaticCore.mod.CookieOptions {
    
    /**
      * @defautl '_csrf'
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object CookieOptions {
    
    @scala.inline
    def apply(): CookieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieOptions]
    }
    
    @scala.inline
    implicit class CookieOptionsMutableBuilder[Self <: CookieOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        def csrfToken(): String
      }
      object Request {
        
        @scala.inline
        def apply(csrfToken: () => String): Request = {
          val __obj = js.Dynamic.literal(csrfToken = js.Any.fromFunction0(csrfToken))
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCsrfToken(value: () => String): Self = StObject.set(x, "csrfToken", js.Any.fromFunction0(value))
        }
      }
    }
  }
}
