package typings.cookiejar.cookiejarMod

import typings.cookiejar.Anon_ToValueString
import typings.cookiejar.cookiejarNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookiejar", "CookieJar")
@js.native
/**
  * class to hold numerous cookies from multiple domains correctly
  */
class CookieJar () extends js.Object {
  /**
    * get a cookie with the name and access_info matching
    * @param cookieName string to be parsed into a Cookie
    * @param accessInfo CookieAccessInfo
    */
  def getCookie(cookieName: String, accessInfo: CookieAccessInfo): Cookie = js.native
  /**
    * grab all cookies matching this access_info
    * @param accessInfo CookieAccessInfo
    */
  def getCookies(accessInfo: CookieAccessInfo): js.Array[Cookie] with Anon_ToValueString = js.native
  /**
    * modify (or add if not already-existing) a cookie to the jar
    * @param cookie string | Cookie
    * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
    * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
    */
  def setCookie(cookie: String): Cookie | `false` = js.native
  def setCookie(cookie: String, requestDomain: String): Cookie | `false` = js.native
  def setCookie(cookie: String, requestDomain: String, requestPath: String): Cookie | `false` = js.native
  def setCookie(cookie: Cookie): Cookie | `false` = js.native
  def setCookie(cookie: Cookie, requestDomain: String): Cookie | `false` = js.native
  def setCookie(cookie: Cookie, requestDomain: String, requestPath: String): Cookie | `false` = js.native
  /**
    * modify (or add if not already-existing) a large number of cookies to the
    * jar
    * @param cookie string or list of strings defining cookies
    * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
    * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
    */
  def setCookies(cookie: String): js.Array[Cookie] | `false` = js.native
  def setCookies(cookie: String, requestDomain: String): js.Array[Cookie] | `false` = js.native
  def setCookies(cookie: String, requestDomain: String, requestPath: String): js.Array[Cookie] | `false` = js.native
  def setCookies(cookie: js.Array[String]): js.Array[Cookie] | `false` = js.native
  def setCookies(cookie: js.Array[String], requestDomain: String): js.Array[Cookie] | `false` = js.native
  def setCookies(cookie: js.Array[String], requestDomain: String, requestPath: String): js.Array[Cookie] | `false` = js.native
}

