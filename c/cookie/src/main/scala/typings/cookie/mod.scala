package typings.cookie

import typings.cookie.cookieBooleans.`false`
import typings.cookie.cookieBooleans.`true`
import typings.cookie.cookieStrings.high
import typings.cookie.cookieStrings.lax
import typings.cookie.cookieStrings.low
import typings.cookie.cookieStrings.medium
import typings.cookie.cookieStrings.none
import typings.cookie.cookieStrings.strict
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(str: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  inline def parse(str: String, options: CookieParseOptions): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  
  inline def serialize(name: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def serialize(name: String, value: String, options: CookieSerializeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait CookieParseOptions extends StObject {
    
    /**
      * Specifies a function that will be used to decode a cookie's value. Since
      * the value of a cookie has a limited character set (and must be a simple
      * string), this function can be used to decode a previously-encoded cookie
      * value into a JavaScript string or other object.
      *
      * The default function is the global `decodeURIComponent`, which will decode
      * any URL-encoded sequences into their byte representations.
      *
      * *Note* if an error is thrown from this function, the original, non-decoded
      * cookie value will be returned as the cookie's value.
      */
    var decode: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  }
  object CookieParseOptions {
    
    inline def apply(): CookieParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CookieParseOptions] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: /* value */ String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
    }
  }
  
  trait CookieSerializeOptions extends StObject {
    
    /**
      * Specifies the value for the {@link https://tools.ietf.org/html/rfc6265#section-5.2.3|Domain Set-Cookie attribute}. By default, no
      * domain is set, and most clients will consider the cookie to apply to only
      * the current domain.
      */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a function that will be used to encode a cookie's value. Since
      * value of a cookie has a limited character set (and must be a simple
      * string), this function can be used to encode a value into a string suited
      * for a cookie's value.
      *
      * The default function is the global `encodeURIComponent`, which will
      * encode a JavaScript string into UTF-8 byte sequences and then URL-encode
      * any that fall outside of the cookie range.
      */
    var encode: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    /**
      * Specifies the `Date` object to be the value for the {@link https://tools.ietf.org/html/rfc6265#section-5.2.1|`Expires` `Set-Cookie` attribute}. By default,
      * no expiration is set, and most clients will consider this a "non-persistent cookie" and will delete
      * it on a condition like exiting a web browser application.
      *
      * *Note* the {@link https://tools.ietf.org/html/rfc6265#section-5.3|cookie storage model specification}
      * states that if both `expires` and `maxAge` are set, then `maxAge` takes precedence, but it is
      * possible not all clients by obey this, so if both are set, they should
      * point to the same date and time.
      */
    var expires: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Specifies the boolean value for the {@link https://tools.ietf.org/html/rfc6265#section-5.2.6|`HttpOnly` `Set-Cookie` attribute}.
      * When truthy, the `HttpOnly` attribute is set, otherwise it is not. By
      * default, the `HttpOnly` attribute is not set.
      *
      * *Note* be careful when setting this to true, as compliant clients will
      * not allow client-side JavaScript to see the cookie in `document.cookie`.
      */
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the number (in seconds) to be the value for the `Max-Age`
      * `Set-Cookie` attribute. The given number will be converted to an integer
      * by rounding down. By default, no maximum age is set.
      *
      * *Note* the {@link https://tools.ietf.org/html/rfc6265#section-5.3|cookie storage model specification}
      * states that if both `expires` and `maxAge` are set, then `maxAge` takes precedence, but it is
      * possible not all clients by obey this, so if both are set, they should
      * point to the same date and time.
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the value for the {@link https://tools.ietf.org/html/rfc6265#section-5.2.4|`Path` `Set-Cookie` attribute}.
      * By default, the path is considered the "default path".
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the `string` to be the value for the [`Priority` `Set-Cookie` attribute][rfc-west-cookie-priority-00-4.1].
      *
      * - `'low'` will set the `Priority` attribute to `Low`.
      * - `'medium'` will set the `Priority` attribute to `Medium`, the default priority when not set.
      * - `'high'` will set the `Priority` attribute to `High`.
      *
      * More information about the different priority levels can be found in
      * [the specification][rfc-west-cookie-priority-00-4.1].
      *
      * **note** This is an attribute that has not yet been fully standardized, and may change in the future.
      * This also means many clients may ignore this attribute until they understand it.
      */
    var priority: js.UndefOr[low | medium | high] = js.undefined
    
    /**
      * Specifies the boolean or string to be the value for the {@link https://tools.ietf.org/html/draft-ietf-httpbis-rfc6265bis-03#section-4.1.2.7|`SameSite` `Set-Cookie` attribute}.
      *
      * - `true` will set the `SameSite` attribute to `Strict` for strict same
      * site enforcement.
      * - `false` will not set the `SameSite` attribute.
      * - `'lax'` will set the `SameSite` attribute to Lax for lax same site
      * enforcement.
      * - `'strict'` will set the `SameSite` attribute to Strict for strict same
      * site enforcement.
      *  - `'none'` will set the SameSite attribute to None for an explicit
      *  cross-site cookie.
      *
      * More information about the different enforcement levels can be found in {@link https://tools.ietf.org/html/draft-ietf-httpbis-rfc6265bis-03#section-4.1.2.7|the specification}.
      *
      * *note* This is an attribute that has not yet been fully standardized, and may change in the future. This also means many clients may ignore this attribute until they understand it.
      */
    var sameSite: js.UndefOr[`true` | `false` | lax | strict | none] = js.undefined
    
    /**
      * Specifies the boolean value for the {@link https://tools.ietf.org/html/rfc6265#section-5.2.5|`Secure` `Set-Cookie` attribute}. When truthy, the
      * `Secure` attribute is set, otherwise it is not. By default, the `Secure` attribute is not set.
      *
      * *Note* be careful when setting this to `true`, as compliant clients will
      * not send the cookie back to the server in the future if the browser does
      * not have an HTTPS connection.
      */
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieSerializeOptions {
    
    inline def apply(): CookieSerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieSerializeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CookieSerializeOptions] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncode(value: /* value */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPriority(value: low | medium | high): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSameSite(value: `true` | `false` | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
}
