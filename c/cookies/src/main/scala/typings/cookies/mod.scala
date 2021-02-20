package typings.cookies

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.connect.mod.NextHandleFunction
import typings.cookies.anon.Instantiable
import typings.cookies.cookiesStrings.lax
import typings.cookies.cookiesStrings.none
import typings.cookies.cookiesStrings.strict
import typings.express.mod.Handler
import typings.keygrip.mod.Keygrip
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cookies", JSImport.Namespace)
  @js.native
  val ^ : CookiesFunction = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("cookies", JSImport.Namespace)
  @js.native
  class Class protected () extends Cookies {
    def this(request: IncomingMessage, response: ServerResponse) = this()
    /**
      * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
      */
    def this(request: IncomingMessage, response: ServerResponse, options: js.Array[String]) = this()
    def this(request: IncomingMessage, response: ServerResponse, options: Option) = this()
    /**
      * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
      */
    // tslint:disable-next-line:unified-signatures
    def this(request: IncomingMessage, response: ServerResponse, options: Keygrip) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("cookies", "Cookie")
  @js.native
  class CookieCls protected () extends Cookie {
    def this(name: String) = this()
    def this(name: String, value: String) = this()
    def this(name: String, value: js.UndefOr[scala.Nothing], attrs: CookieAttr) = this()
    def this(name: String, value: String, attrs: CookieAttr) = this()
  }
  
  @js.native
  trait Cookie extends StObject {
    
    var domain: String = js.native
    
    var expires: Date = js.native
    
    var httpOnly: Boolean = js.native
    
    var maxAge: Double = js.native
    
    /**
      * "maxage" is deprecated, use "maxAge" instead
      */
    var maxage: Double = js.native
    
    var name: String = js.native
    
    var overwrite: Boolean = js.native
    
    var path: String = js.native
    
    var sameSite: Boolean = js.native
    
    var secure: Boolean = js.native
    
    def toHeader(): String = js.native
    
    var value: String = js.native
  }
  object Cookie {
    
    @scala.inline
    def apply(
      domain: String,
      expires: Date,
      httpOnly: Boolean,
      maxAge: Double,
      maxage: Double,
      name: String,
      overwrite: Boolean,
      path: String,
      sameSite: Boolean,
      secure: Boolean,
      toHeader: () => String,
      value: String
    ): Cookie = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], maxage = maxage.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], toHeader = js.Any.fromFunction0(toHeader), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSite(value: Boolean): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToHeader(value: () => String): Self = StObject.set(x, "toHeader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type CookieAttr = SetOption
  
  @js.native
  trait Cookies extends StObject {
    
    /**
      * This extracts the cookie with the given name from the
      * Cookie header in the request. If such a cookie exists,
      * its value is returned. Otherwise, nothing is returned.
      */
    def get(name: String): js.UndefOr[String] = js.native
    def get(name: String, opts: GetOption): js.UndefOr[String] = js.native
    
    var request: IncomingMessage = js.native
    
    var response: ServerResponse = js.native
    
    var secure: Boolean = js.native
    
    def set(name: String): this.type = js.native
    def set(name: String, opts: SetOption): this.type = js.native
    /**
      * This sets the given cookie in the response and returns
      * the current context to allow chaining.If the value is omitted,
      * an outbound header with an expired date is used to delete the cookie.
      */
    def set(name: String, value: String): this.type = js.native
    def set(name: String, value: String, opts: SetOption): this.type = js.native
  }
  
  @js.native
  trait CookiesFunction
    extends /**
    * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
    */
  /**
    * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  Instantiable3[
          /* request */ IncomingMessage, 
          /* response */ ServerResponse, 
          (/* options */ js.Array[String]) | (/* options */ Keygrip) | (/* options */ Option), 
          Cookies
        ]
       with Instantiable2[/* request */ IncomingMessage, /* response */ ServerResponse, Cookies] {
    
    def apply(request: IncomingMessage, response: ServerResponse): Cookies = js.native
    /**
      * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
      */
    def apply(request: IncomingMessage, response: ServerResponse, options: js.Array[String]): Cookies = js.native
    def apply(request: IncomingMessage, response: ServerResponse, options: Option): Cookies = js.native
    /**
      * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
      */
    // tslint:disable-next-line:unified-signatures
    def apply(request: IncomingMessage, response: ServerResponse, options: Keygrip): Cookies = js.native
    
    var Cookie: Instantiable = js.native
    
    def connect(keys: js.Array[String]): NextHandleFunction = js.native
    def connect(keys: Keygrip): NextHandleFunction = js.native
    
    def express(keys: js.Array[String]): Handler = js.native
    def express(keys: Keygrip): Handler = js.native
  }
  
  @js.native
  trait GetOption extends StObject {
    
    var signed: Boolean = js.native
  }
  object GetOption {
    
    @scala.inline
    def apply(signed: Boolean): GetOption = {
      val __obj = js.Dynamic.literal(signed = signed.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOption]
    }
    
    @scala.inline
    implicit class GetOptionMutableBuilder[Self <: GetOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * for backward-compatibility
    */
  type ICookies = Cookies
  
  /**
    * for backward-compatibility
    */
  type IOptions = SetOption
  
  @js.native
  trait Option extends StObject {
    
    var keys: js.UndefOr[js.Array[String] | Keygrip] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeys(value: js.Array[String] | Keygrip): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  @js.native
  trait SetOption extends StObject {
    
    /**
      * a string indicating the domain of the cookie (no default).
      */
    var domain: js.UndefOr[String] = js.native
    
    /**
      * a Date object indicating the cookie's expiration
      * date (expires at the end of session by default).
      */
    var expires: js.UndefOr[Date] = js.native
    
    /**
      * a boolean indicating whether the cookie is only to be sent over HTTP(S),
      * and not made available to client JavaScript (true by default).
      */
    var httpOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * a number representing the milliseconds from Date.now() for expiry
      */
    var maxAge: js.UndefOr[Double] = js.native
    
    /**
      * a boolean indicating whether to overwrite previously set
      * cookies of the same name (false by default). If this is true,
      * all cookies set during the same request with the same
      * name (regardless of path or domain) are filtered out of
      * the Set-Cookie header when setting this cookie.
      */
    var overwrite: js.UndefOr[Boolean] = js.native
    
    /**
      * a string indicating the path of the cookie (/ by default).
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * a boolean or string indicating whether the cookie is a "same site" cookie (false by default).
      * This can be set to 'strict', 'lax', or true (which maps to 'strict').
      */
    var sameSite: js.UndefOr[strict | lax | none | Boolean] = js.native
    
    /**
      * a boolean indicating whether the cookie is only to be sent
      * over HTTPS (false by default for HTTP, true by default for HTTPS).
      */
    var secure: js.UndefOr[Boolean] = js.native
    
    /**
      * "secureProxy" option is deprecated; use "secure" option, provide "secure" to constructor if needed
      */
    var secureProxy: js.UndefOr[Boolean] = js.native
    
    /**
      * a boolean indicating whether the cookie is to be signed (false by default).
      * If this is true, another cookie of the same name with the .sig suffix
      * appended will also be sent, with a 27-byte url-safe base64 SHA1 value
      * representing the hash of cookie-name=cookie-value against the first Keygrip key.
      * This signature key is used to detect tampering the next time a cookie is received.
      */
    var signed: js.UndefOr[Boolean] = js.native
  }
  object SetOption {
    
    @scala.inline
    def apply(): SetOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOption]
    }
    
    @scala.inline
    implicit class SetOptionMutableBuilder[Self <: SetOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSameSite(value: strict | lax | none | Boolean): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProxy(value: Boolean): Self = StObject.set(x, "secureProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProxyUndefined: Self = StObject.set(x, "secureProxy", js.undefined)
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
  
  type _To = CookiesFunction
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CookiesFunction = ^
}
