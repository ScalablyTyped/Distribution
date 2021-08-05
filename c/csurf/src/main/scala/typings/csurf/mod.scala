package typings.csurf

import typings.csurf.anon.Cookie
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]]
  inline def apply(options: Cookie): RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]]
  
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
    
    inline def apply(): CookieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieOptions]
    }
    
    extension [Self <: CookieOptions](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        def csrfToken(): String
      }
      object Request {
        
        inline def apply(csrfToken: () => String): Request = {
          val __obj = js.Dynamic.literal(csrfToken = js.Any.fromFunction0(csrfToken))
          __obj.asInstanceOf[Request]
        }
        
        extension [Self <: Request](x: Self) {
          
          inline def setCsrfToken(value: () => String): Self = StObject.set(x, "csrfToken", js.Any.fromFunction0(value))
        }
      }
    }
  }
}
