package typings.cookieParser

import org.scalablytyped.runtime.StringDictionary
import typings.cookieParser.cookieParserBooleans.`false`
import typings.express.mod.RequestHandler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(secret: String): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(secret.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(secret: String, options: CookieParseOptions): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].apply(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(secret: js.Array[String]): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(secret.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(secret: js.Array[String], options: CookieParseOptions): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].apply(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(secret: Unit, options: CookieParseOptions): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].apply(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("cookie-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def JSONCookie(jsonCookie: String): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONCookie")(jsonCookie.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]
  
  inline def JSONCookies[T /* <: StringDictionary[String] */](jsonCookies: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: object | undefined} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONCookies")(jsonCookies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: object | undefined} */ js.Any]
  
  inline def signedCookie(cookie: String, secret: String): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("signedCookie")(cookie.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def signedCookie(cookie: String, secret: js.Array[String]): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("signedCookie")(cookie.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  
  inline def signedCookies[T /* <: StringDictionary[String] */](cookies: T, secret: String): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? string | false} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("signedCookies")(cookies.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? string | false} */ js.Any]
  inline def signedCookies[T /* <: StringDictionary[String] */](cookies: T, secret: js.Array[String]): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? string | false} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("signedCookies")(cookies.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? string | false} */ js.Any]
  
  trait CookieParseOptions extends StObject {
    
    var decode: js.UndefOr[js.Function1[/* val */ String, String]] = js.undefined
  }
  object CookieParseOptions {
    
    inline def apply(): CookieParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CookieParseOptions] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: /* val */ String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      // Inject additional properties on express.Request
      trait Request extends StObject {
        
        /**
          * This request's secret.
          * Optionally set by cookie-parser if secret(s) are provided.  Can be used by other middleware.
          * [Declaration merging](https://www.typescriptlang.org/docs/handbook/declaration-merging.html) can be used to add your own properties.
          */
        var secret: js.UndefOr[String] = js.undefined
      }
      object Request {
        
        inline def apply(): Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
          
          inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
        }
      }
    }
  }
}
