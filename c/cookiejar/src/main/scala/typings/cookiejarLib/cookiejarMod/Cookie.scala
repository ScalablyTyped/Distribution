package typings
package cookiejarLib.cookiejarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookiejar", "Cookie")
@js.native
class Cookie protected () extends js.Object {
   // number of millis since 1970 at which this should be removed
  /**
       * It turns input into a Cookie (singleton if given a Cookie), the
       * request_domain argument is used to default the domain if it is not
       * explicit in the cookie string, the request_path argument is used to set
       * the path if it is not explicit in a cookie String.
       *
       * Explicit domains/paths will cascade, implied domains/paths must exactly
       * match (see http://en.wikipedia.org/wiki/HTTP_cookie#Domain_and_Pat).
       * @param cookie string or a cookie to work on
       * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
       * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
       */
  def this(cookie: Cookie) = this()
   // number of millis since 1970 at which this should be removed
  /**
       * It turns input into a Cookie (singleton if given a Cookie), the
       * request_domain argument is used to default the domain if it is not
       * explicit in the cookie string, the request_path argument is used to set
       * the path if it is not explicit in a cookie String.
       *
       * Explicit domains/paths will cascade, implied domains/paths must exactly
       * match (see http://en.wikipedia.org/wiki/HTTP_cookie#Domain_and_Pat).
       * @param cookie string or a cookie to work on
       * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
       * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
       */
  def this(cookie: java.lang.String) = this()
   // number of millis since 1970 at which this should be removed
  /**
       * It turns input into a Cookie (singleton if given a Cookie), the
       * request_domain argument is used to default the domain if it is not
       * explicit in the cookie string, the request_path argument is used to set
       * the path if it is not explicit in a cookie String.
       *
       * Explicit domains/paths will cascade, implied domains/paths must exactly
       * match (see http://en.wikipedia.org/wiki/HTTP_cookie#Domain_and_Pat).
       * @param cookie string or a cookie to work on
       * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
       * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
       */
  def this(cookie: Cookie, requestDomain: java.lang.String) = this()
   // number of millis since 1970 at which this should be removed
  /**
       * It turns input into a Cookie (singleton if given a Cookie), the
       * request_domain argument is used to default the domain if it is not
       * explicit in the cookie string, the request_path argument is used to set
       * the path if it is not explicit in a cookie String.
       *
       * Explicit domains/paths will cascade, implied domains/paths must exactly
       * match (see http://en.wikipedia.org/wiki/HTTP_cookie#Domain_and_Pat).
       * @param cookie string or a cookie to work on
       * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
       * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
       */
  def this(cookie: java.lang.String, requestDomain: java.lang.String) = this()
   // number of millis since 1970 at which this should be removed
  /**
       * It turns input into a Cookie (singleton if given a Cookie), the
       * request_domain argument is used to default the domain if it is not
       * explicit in the cookie string, the request_path argument is used to set
       * the path if it is not explicit in a cookie String.
       *
       * Explicit domains/paths will cascade, implied domains/paths must exactly
       * match (see http://en.wikipedia.org/wiki/HTTP_cookie#Domain_and_Pat).
       * @param cookie string or a cookie to work on
       * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
       * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
       */
  def this(cookie: Cookie, requestDomain: java.lang.String, requestPath: java.lang.String) = this()
   // number of millis since 1970 at which this should be removed
  /**
       * It turns input into a Cookie (singleton if given a Cookie), the
       * request_domain argument is used to default the domain if it is not
       * explicit in the cookie string, the request_path argument is used to set
       * the path if it is not explicit in a cookie String.
       *
       * Explicit domains/paths will cascade, implied domains/paths must exactly
       * match (see http://en.wikipedia.org/wiki/HTTP_cookie#Domain_and_Pat).
       * @param cookie string or a cookie to work on
       * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
       * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
       */
  def this(cookie: java.lang.String, requestDomain: java.lang.String, requestPath: java.lang.String) = this()
   // string associated with the cookie
  var domain: java.lang.String = js.native
   // should it only be transmitted over secure means
  var expiration_date: scala.Double = js.native
   // domain to match (on a cookie a '.' at the start means a wildcard matching anything ending in the rest)
  var explicit_domain: scala.Boolean = js.native
   // base path to match (matches any path starting with this '/' is root)
  var explicit_path: scala.Boolean = js.native
  var name: java.lang.String = js.native
   // if the path was explicitly set via the cookie string
  var noscript: scala.Boolean = js.native
   // if the domain was explicitly set via the cookie string
  var path: java.lang.String = js.native
   // if it should be kept from scripts
  var secure: scala.Boolean = js.native
   // name of the cookie
  var value: java.lang.String = js.native
  /**
       * returns true if the cookies cannot exist in the same space
       * (domain and path match)
       * @param cookie Cookie
       */
  def collidesWith(cookie: Cookie): scala.Boolean = js.native
  /**
       * returns true if the access_info allows retrieval of this cookie
       * @param accessInfo CookieAccessInfo
       */
  def matches(accessInfo: CookieAccessInfo): scala.Boolean = js.native
  /**
       * parses the string onto this cookie or a new one if called directly
       * @param cookie string to be parsed into a Cookie
       * @param requestDomain string definind the requesting domain
       * @param requestPath string defining the requesting path
       */
  def parse(cookie: java.lang.String): Cookie = js.native
  /**
       * parses the string onto this cookie or a new one if called directly
       * @param cookie string to be parsed into a Cookie
       * @param requestDomain string definind the requesting domain
       * @param requestPath string defining the requesting path
       */
  def parse(cookie: java.lang.String, requestDomain: java.lang.String): Cookie = js.native
  /**
       * parses the string onto this cookie or a new one if called directly
       * @param cookie string to be parsed into a Cookie
       * @param requestDomain string definind the requesting domain
       * @param requestPath string defining the requesting path
       */
  def parse(cookie: java.lang.String, requestDomain: java.lang.String, requestPath: java.lang.String): Cookie = js.native
  /**
       * the cookie: string for this cookie
       */
  def toValueString(): java.lang.String = js.native
}

