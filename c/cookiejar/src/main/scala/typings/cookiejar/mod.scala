package typings.cookiejar

import typings.cookiejar.anon.ReadonlyArrayCookietoValu
import typings.cookiejar.cookiejarBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cookiejar", "Cookie")
  @js.native
  class Cookie protected () extends StObject {
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
    def this(cookie: String) = this()
    def this(cookie: Cookie) = this()
    def this(cookie: String, requestDomain: String) = this()
    def this(cookie: Cookie, requestDomain: String) = this()
    def this(cookie: String, requestDomain: js.UndefOr[scala.Nothing], requestPath: String) = this()
    def this(cookie: String, requestDomain: String, requestPath: String) = this()
    def this(cookie: Cookie, requestDomain: js.UndefOr[scala.Nothing], requestPath: String) = this()
    def this(cookie: Cookie, requestDomain: String, requestPath: String) = this()
    
    /**
      * returns true if the cookies cannot exist in the same space
      * (domain and path match)
      * @param cookie Cookie
      */
    def collidesWith(cookie: Cookie): Boolean = js.native
    
    // string associated with the cookie
    var domain: String = js.native
    
    // should it only be transmitted over secure means
    var expiration_date: Double = js.native
    
    // domain to match (on a cookie a '.' at the start means a wildcard matching anything ending in the rest)
    var explicit_domain: Boolean = js.native
    
    // base path to match (matches any path starting with this '/' is root)
    var explicit_path: Boolean = js.native
    
    /**
      * returns true if the access_info allows retrieval of this cookie
      * @param accessInfo CookieAccessInfo
      */
    def matches(accessInfo: CookieAccessInfo): Boolean = js.native
    
    var name: String = js.native
    
    // if the path was explicitly set via the cookie string
    var noscript: Boolean = js.native
    
    /**
      * parses the string onto this cookie or a new one if called directly
      * @param cookie string to be parsed into a Cookie
      * @param requestDomain string definind the requesting domain
      * @param requestPath string defining the requesting path
      */
    def parse(cookie: String): Cookie = js.native
    def parse(cookie: String, requestDomain: js.UndefOr[scala.Nothing], requestPath: String): Cookie = js.native
    def parse(cookie: String, requestDomain: String): Cookie = js.native
    def parse(cookie: String, requestDomain: String, requestPath: String): Cookie = js.native
    
    // if the domain was explicitly set via the cookie string
    var path: String = js.native
    
    // if it should be kept from scripts
    var secure: Boolean = js.native
    
    /**
      * the cookie: string for this cookie
      */
    def toValueString(): String = js.native
    
    // name of the cookie
    var value: String = js.native
  }
  
  @JSImport("cookiejar", "CookieAccessInfo")
  @js.native
  class CookieAccessInfo protected () extends StObject {
    /**
      * Class to determine matching qualities of a cookie
      * @param domain string domain to match
      * @param path string path to match
      * @param secure boolean access is secure (ssl generally)
      * @param script boolean access is from a script
      */
    def this(domain: String) = this()
    def this(domain: String, path: String) = this()
    def this(domain: String, path: js.UndefOr[scala.Nothing], secure: Boolean) = this()
    def this(domain: String, path: String, secure: Boolean) = this()
    def this(
      domain: String,
      path: js.UndefOr[scala.Nothing],
      secure: js.UndefOr[scala.Nothing],
      script: Boolean
    ) = this()
    def this(domain: String, path: js.UndefOr[scala.Nothing], secure: Boolean, script: Boolean) = this()
    def this(domain: String, path: String, secure: js.UndefOr[scala.Nothing], script: Boolean) = this()
    def this(domain: String, path: String, secure: Boolean, script: Boolean) = this()
    
    var domain: String = js.native
    
    // domain to match
    var path: String = js.native
    
    // access is secure (ssl generally)
    var script: Boolean = js.native
    
    // path to match
    var secure: Boolean = js.native
  }
  /* static members */
  object CookieAccessInfo {
    
    @JSImport("cookiejar", "CookieAccessInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cookiejar", "CookieAccessInfo.All")
    @js.native
    def All: CookieAccessInfo = js.native
    @scala.inline
    def All_=(x: CookieAccessInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("cookiejar", "CookieJar")
  @js.native
  /**
    * class to hold numerous cookies from multiple domains correctly
    */
  class CookieJar () extends StObject {
    
    /**
      * get a cookie with the name and access_info matching
      * @param cookieName string to be parsed into a Cookie
      * @param accessInfo CookieAccessInfo
      */
    def getCookie(cookieName: String, accessInfo: CookieAccessInfo): js.UndefOr[Cookie] = js.native
    
    /**
      * grab all cookies matching this access_info
      * @param accessInfo CookieAccessInfo
      */
    def getCookies(accessInfo: CookieAccessInfo): ReadonlyArrayCookietoValu = js.native
    
    /**
      * modify (or add if not already-existing) a cookie to the jar
      * @param cookie string | Cookie
      * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
      * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
      */
    def setCookie(cookie: String): Cookie | `false` = js.native
    def setCookie(cookie: String, requestDomain: js.UndefOr[scala.Nothing], requestPath: String): Cookie | `false` = js.native
    def setCookie(cookie: String, requestDomain: String): Cookie | `false` = js.native
    def setCookie(cookie: String, requestDomain: String, requestPath: String): Cookie | `false` = js.native
    def setCookie(cookie: Cookie): Cookie | `false` = js.native
    def setCookie(cookie: Cookie, requestDomain: js.UndefOr[scala.Nothing], requestPath: String): Cookie | `false` = js.native
    def setCookie(cookie: Cookie, requestDomain: String): Cookie | `false` = js.native
    def setCookie(cookie: Cookie, requestDomain: String, requestPath: String): Cookie | `false` = js.native
    
    /**
      * modify (or add if not already-existing) a large number of cookies to the
      * jar
      * @param cookie string or list of strings defining cookies
      * @param requestDomain string argument is used to default the domain if it is not explicit in the cookie string
      * @param requestPath string argument is used to set the path if it is not explicit in a cookie String
      */
    def setCookies(cookie: String): js.Array[Cookie] = js.native
    def setCookies(cookie: String, requestDomain: js.UndefOr[scala.Nothing], requestPath: String): js.Array[Cookie] = js.native
    def setCookies(cookie: String, requestDomain: String): js.Array[Cookie] = js.native
    def setCookies(cookie: String, requestDomain: String, requestPath: String): js.Array[Cookie] = js.native
    def setCookies(cookie: js.Array[String]): js.Array[Cookie] = js.native
    def setCookies(cookie: js.Array[String], requestDomain: js.UndefOr[scala.Nothing], requestPath: String): js.Array[Cookie] = js.native
    def setCookies(cookie: js.Array[String], requestDomain: String): js.Array[Cookie] = js.native
    def setCookies(cookie: js.Array[String], requestDomain: String, requestPath: String): js.Array[Cookie] = js.native
  }
}
