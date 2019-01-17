package typings
package cookiejarLib.cookiejarMod

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
  def getCookie(cookieName: java.lang.String, accessInfo: CookieAccessInfo): Cookie = js.native
  /**
    * grab all cookies matching this access_info
    * @param accessInfo CookieAccessInfo
    */
  def getCookies(accessInfo: CookieAccessInfo): js.Array[Cookie] with cookiejarLib.Anon_ToValueString = js.native
  def setCookie(cookie: Cookie): Cookie | cookiejarLib.cookiejarLibNumbers.`false` = js.native
  def setCookie(cookie: Cookie, requestDomain: java.lang.String): Cookie | cookiejarLib.cookiejarLibNumbers.`false` = js.native
  def setCookie(cookie: Cookie, requestDomain: java.lang.String, requestPath: java.lang.String): Cookie | cookiejarLib.cookiejarLibNumbers.`false` = js.native
  /**
    * modify (or add if not already-existing) a cookie to the jar
    * @param cookie string | Cookie
    * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
    * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
    */
  def setCookie(cookie: java.lang.String): Cookie | cookiejarLib.cookiejarLibNumbers.`false` = js.native
  def setCookie(cookie: java.lang.String, requestDomain: java.lang.String): Cookie | cookiejarLib.cookiejarLibNumbers.`false` = js.native
  def setCookie(cookie: java.lang.String, requestDomain: java.lang.String, requestPath: java.lang.String): Cookie | cookiejarLib.cookiejarLibNumbers.`false` = js.native
  /**
    * modify (or add if not already-existing) a large number of cookies to the
    * jar
    * @param cookie string or list of strings defining cookies
    * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
    * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
    */
  def setCookies(cookie: java.lang.String): js.Array[Cookie] | cookiejarLib.cookiejarLibNumbers.`false` = js.native
  def setCookies(cookie: java.lang.String, requestDomain: java.lang.String): js.Array[Cookie] | cookiejarLib.cookiejarLibNumbers.`false` = js.native
  def setCookies(cookie: java.lang.String, requestDomain: java.lang.String, requestPath: java.lang.String): js.Array[Cookie] | cookiejarLib.cookiejarLibNumbers.`false` = js.native
  def setCookies(cookie: js.Array[java.lang.String]): js.Array[Cookie] | cookiejarLib.cookiejarLibNumbers.`false` = js.native
  def setCookies(cookie: js.Array[java.lang.String], requestDomain: java.lang.String): js.Array[Cookie] | cookiejarLib.cookiejarLibNumbers.`false` = js.native
  def setCookies(cookie: js.Array[java.lang.String], requestDomain: java.lang.String, requestPath: java.lang.String): js.Array[Cookie] | cookiejarLib.cookiejarLibNumbers.`false` = js.native
}

