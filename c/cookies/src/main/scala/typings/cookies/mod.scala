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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cookies", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CookiesFunction = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("cookies", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Cookies {
    def this(request: IncomingMessage, response: ServerResponse[IncomingMessage]) = this()
    /**
      * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
      */
    def this(request: IncomingMessage, response: ServerResponse[IncomingMessage], options: js.Array[String]) = this()
    def this(request: IncomingMessage, response: ServerResponse[IncomingMessage], options: Option) = this()
    /**
      * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
      */
    // tslint:disable-next-line:unified-signatures
    def this(request: IncomingMessage, response: ServerResponse[IncomingMessage], options: Keygrip) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("cookies", "Cookie")
  @js.native
  open class CookieCls protected ()
    extends StObject
       with Cookie {
    def this(name: String) = this()
    def this(name: String, value: String) = this()
    def this(name: String, value: String, attrs: CookieAttr) = this()
    def this(name: String, value: Unit, attrs: CookieAttr) = this()
    
    /* CompleteClass */
    var domain: String = js.native
    
    /* CompleteClass */
    var expires: js.Date = js.native
    
    /* CompleteClass */
    var httpOnly: Boolean = js.native
    
    /* CompleteClass */
    var maxAge: Double = js.native
    
    /**
      * "maxage" is deprecated, use "maxAge" instead
      */
    /* CompleteClass */
    var maxage: Double = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var overwrite: Boolean = js.native
    
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    var sameSite: Boolean = js.native
    
    /* CompleteClass */
    var secure: Boolean = js.native
    
    /* CompleteClass */
    override def toHeader(): String = js.native
    
    /* CompleteClass */
    var value: String = js.native
  }
  
  trait Cookie extends StObject {
    
    var domain: String
    
    var expires: js.Date
    
    var httpOnly: Boolean
    
    var maxAge: Double
    
    /**
      * "maxage" is deprecated, use "maxAge" instead
      */
    var maxage: Double
    
    var name: String
    
    var overwrite: Boolean
    
    var path: String
    
    var sameSite: Boolean
    
    var secure: Boolean
    
    def toHeader(): String
    
    var value: String
  }
  object Cookie {
    
    inline def apply(
      domain: String,
      expires: js.Date,
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
    
    extension [Self <: Cookie](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSameSite(value: Boolean): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setToHeader(value: () => String): Self = StObject.set(x, "toHeader", js.Any.fromFunction0(value))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    var response: ServerResponse[IncomingMessage] = js.native
    
    var secure: Boolean = js.native
    
    /**
      * This sets the given cookie in the response and returns
      * the current context to allow chaining.If the value is omitted,
      * an outbound header with an expired date is used to delete the cookie.
      */
    def set(name: String): this.type = js.native
    def set(name: String, value: String): this.type = js.native
    def set(name: String, value: String, opts: SetOption): this.type = js.native
    def set(name: String, value: Null, opts: SetOption): this.type = js.native
    def set(name: String, value: Unit, opts: SetOption): this.type = js.native
  }
  
  @js.native
  trait CookiesFunction
    extends StObject
       with /**
    * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
    */
  /**
    * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  Instantiable3[
          /* request */ IncomingMessage, 
          /* response */ ServerResponse[IncomingMessage], 
          (/* options */ js.Array[String]) | (/* options */ Keygrip) | (/* options */ Option), 
          Cookies
        ]
       with Instantiable2[
          /* request */ IncomingMessage, 
          /* response */ ServerResponse[IncomingMessage], 
          Cookies
        ] {
    
    def apply(request: IncomingMessage, response: ServerResponse[IncomingMessage]): Cookies = js.native
    /**
      * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
      */
    def apply(request: IncomingMessage, response: ServerResponse[IncomingMessage], options: js.Array[String]): Cookies = js.native
    def apply(request: IncomingMessage, response: ServerResponse[IncomingMessage], options: Option): Cookies = js.native
    /**
      * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
      */
    // tslint:disable-next-line:unified-signatures
    def apply(request: IncomingMessage, response: ServerResponse[IncomingMessage], options: Keygrip): Cookies = js.native
    
    var Cookie: Instantiable = js.native
    
    def connect(keys: js.Array[String]): NextHandleFunction = js.native
    def connect(keys: Keygrip): NextHandleFunction = js.native
    
    def express(keys: js.Array[String]): Handler = js.native
    def express(keys: Keygrip): Handler = js.native
  }
  
  trait GetOption extends StObject {
    
    var signed: Boolean
  }
  object GetOption {
    
    inline def apply(signed: Boolean): GetOption = {
      val __obj = js.Dynamic.literal(signed = signed.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOption]
    }
    
    extension [Self <: GetOption](x: Self) {
      
      inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
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
  
  trait Option extends StObject {
    
    var keys: js.UndefOr[js.Array[String] | Keygrip] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setKeys(value: js.Array[String] | Keygrip): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  trait SetOption extends StObject {
    
    /**
      * a string indicating the domain of the cookie (no default).
      */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * a Date object indicating the cookie's expiration
      * date (expires at the end of session by default).
      */
    var expires: js.UndefOr[js.Date] = js.undefined
    
    /**
      * a boolean indicating whether the cookie is only to be sent over HTTP(S),
      * and not made available to client JavaScript (true by default).
      */
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a number representing the milliseconds from Date.now() for expiry
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * a boolean indicating whether to overwrite previously set
      * cookies of the same name (false by default). If this is true,
      * all cookies set during the same request with the same
      * name (regardless of path or domain) are filtered out of
      * the Set-Cookie header when setting this cookie.
      */
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a string indicating the path of the cookie (/ by default).
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * a boolean or string indicating whether the cookie is a "same site" cookie (false by default).
      * This can be set to 'strict', 'lax', or true (which maps to 'strict').
      */
    var sameSite: js.UndefOr[strict | lax | none | Boolean] = js.undefined
    
    /**
      * a boolean indicating whether the cookie is only to be sent
      * over HTTPS (false by default for HTTP, true by default for HTTPS).
      */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * "secureProxy" option is deprecated; use "secure" option, provide "secure" to constructor if needed
      */
    var secureProxy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a boolean indicating whether the cookie is to be signed (false by default).
      * If this is true, another cookie of the same name with the .sig suffix
      * appended will also be sent, with a 27-byte url-safe base64 SHA1 value
      * representing the hash of cookie-name=cookie-value against the first Keygrip key.
      * This signature key is used to detect tampering the next time a cookie is received.
      */
    var signed: js.UndefOr[Boolean] = js.undefined
  }
  object SetOption {
    
    inline def apply(): SetOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOption]
    }
    
    extension [Self <: SetOption](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: strict | lax | none | Boolean): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureProxy(value: Boolean): Self = StObject.set(x, "secureProxy", value.asInstanceOf[js.Any])
      
      inline def setSecureProxyUndefined: Self = StObject.set(x, "secureProxy", js.undefined)
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
  
  type _To = js.Object & CookiesFunction
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & CookiesFunction = ^
}
