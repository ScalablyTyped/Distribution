package typings.cookieParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.cookieParser.cookieParserBooleans.`false`
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(secret: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(secret.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(secret: String, options: CookieParseOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(secret: js.Array[String]): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(secret.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(secret: js.Array[String], options: CookieParseOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(secret: Unit, options: CookieParseOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("cookie-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def JSONCookie(jsonCookie: String): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONCookie")(jsonCookie.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]
  
  inline def JSONCookies[T /* <: StringDictionary[String] */](jsonCookies: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: object | undefined}
    */ typings.cookieParser.cookieParserStrings.JSONCookies & TopLevel[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONCookies")(jsonCookies.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: object | undefined}
    */ typings.cookieParser.cookieParserStrings.JSONCookies & TopLevel[js.Any]]
  
  inline def signedCookie(cookie: String, secret: String): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("signedCookie")(cookie.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  inline def signedCookie(cookie: String, secret: js.Array[String]): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("signedCookie")(cookie.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  
  inline def signedCookies[T /* <: StringDictionary[String] */](cookies: T, secret: String): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | false}
    */ typings.cookieParser.cookieParserStrings.signedCookies & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("signedCookies")(cookies.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | false}
    */ typings.cookieParser.cookieParserStrings.signedCookies & TopLevel[js.Any]]
  inline def signedCookies[T /* <: StringDictionary[String] */](cookies: T, secret: js.Array[String]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | false}
    */ typings.cookieParser.cookieParserStrings.signedCookies & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("signedCookies")(cookies.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | false}
    */ typings.cookieParser.cookieParserStrings.signedCookies & TopLevel[js.Any]]
  
  trait CookieParseOptions extends StObject {
    
    var decode: js.UndefOr[js.Function1[/* val */ String, String]] = js.undefined
  }
  object CookieParseOptions {
    
    inline def apply(): CookieParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieParseOptions]
    }
    
    extension [Self <: CookieParseOptions](x: Self) {
      
      inline def setDecode(value: /* val */ String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
    }
  }
}
