package typings.cookieDashParser.cookieDashParserMod

import org.scalablytyped.runtime.StringDictionary
import typings.cookieDashParser.cookieDashParserNumbers.`false`
import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookie-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(secret: String | js.Array[String]): RequestHandler = js.native
  def apply(secret: String | js.Array[String], options: CookieParseOptions): RequestHandler = js.native
  def JSONCookie(jsonCookie: String): js.UndefOr[js.Object] = js.native
  def JSONCookies[T /* <: StringDictionary[String] */](jsonCookies: T): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: object | undefined}
    */ typings.cookieDashParser.cookieDashParserStrings.JSONCookies with js.Any = js.native
  def signedCookie(cookie: String, secret: String): String | `false` = js.native
  def signedCookie(cookie: String, secret: js.Array[String]): String | `false` = js.native
  def signedCookies[T /* <: StringDictionary[String] */](cookies: T, secret: String): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | false}
    */ typings.cookieDashParser.cookieDashParserStrings.signedCookies with js.Any = js.native
  def signedCookies[T /* <: StringDictionary[String] */](cookies: T, secret: js.Array[String]): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | false}
    */ typings.cookieDashParser.cookieDashParserStrings.signedCookies with js.Any = js.native
}

