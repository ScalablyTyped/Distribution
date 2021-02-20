package typings.csurf

import typings.csurf.anon.Cookie
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csurf", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  @JSImport("csurf", JSImport.Namespace)
  @js.native
  def apply(options: Cookie): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
  
  @js.native
  trait CookieOptions
    extends typings.expressServeStaticCore.mod.CookieOptions {
    
    /**
      * @defautl '_csrf'
      */
    var key: js.UndefOr[String] = js.native
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
      
      @js.native
      trait Request extends StObject {
        
        def csrfToken(): String = js.native
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
