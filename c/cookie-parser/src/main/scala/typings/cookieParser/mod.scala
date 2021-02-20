package typings.cookieParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.cookieParser.cookieParserBooleans.`false`
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cookie-parser", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("cookie-parser", JSImport.Namespace)
  @js.native
  def apply(secret: js.UndefOr[scala.Nothing], options: CookieParseOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("cookie-parser", JSImport.Namespace)
  @js.native
  def apply(secret: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("cookie-parser", JSImport.Namespace)
  @js.native
  def apply(secret: String, options: CookieParseOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("cookie-parser", JSImport.Namespace)
  @js.native
  def apply(secret: js.Array[String]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("cookie-parser", JSImport.Namespace)
  @js.native
  def apply(secret: js.Array[String], options: CookieParseOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("cookie-parser", "JSONCookie")
  @js.native
  def JSONCookie(jsonCookie: String): js.UndefOr[js.Object] = js.native
  
  @JSImport("cookie-parser", "JSONCookies")
  @js.native
  def JSONCookies[T /* <: StringDictionary[String] */](jsonCookies: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: object | undefined}
    */ typings.cookieParser.cookieParserStrings.JSONCookies with TopLevel[js.Any] = js.native
  
  @JSImport("cookie-parser", "signedCookie")
  @js.native
  def signedCookie(cookie: String, secret: String): String | `false` = js.native
  @JSImport("cookie-parser", "signedCookie")
  @js.native
  def signedCookie(cookie: String, secret: js.Array[String]): String | `false` = js.native
  
  @JSImport("cookie-parser", "signedCookies")
  @js.native
  def signedCookies[T /* <: StringDictionary[String] */](cookies: T, secret: String): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | false}
    */ typings.cookieParser.cookieParserStrings.signedCookies with TopLevel[js.Any] = js.native
  @JSImport("cookie-parser", "signedCookies")
  @js.native
  def signedCookies[T /* <: StringDictionary[String] */](cookies: T, secret: js.Array[String]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | false}
    */ typings.cookieParser.cookieParserStrings.signedCookies with TopLevel[js.Any] = js.native
  
  @js.native
  trait CookieParseOptions extends StObject {
    
    var decode: js.UndefOr[js.Function1[/* val */ String, String]] = js.native
  }
  object CookieParseOptions {
    
    @scala.inline
    def apply(): CookieParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieParseOptions]
    }
    
    @scala.inline
    implicit class CookieParseOptionsMutableBuilder[Self <: CookieParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: /* val */ String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
    }
  }
}
