package typings.cookie.mod

import typings.cookie.cookieBooleans.`false`
import typings.cookie.cookieBooleans.`true`
import typings.cookie.cookieStrings.lax
import typings.cookie.cookieStrings.none
import typings.cookie.cookieStrings.strict
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieSerializeOptions extends js.Object {
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
  var expires: js.UndefOr[Date] = js.undefined
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
  @scala.inline
  def apply(
    domain: String = null,
    encode: /* value */ String => String = null,
    expires: Date = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    maxAge: js.UndefOr[Double] = js.undefined,
    path: String = null,
    sameSite: `true` | `false` | lax | strict | none = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): CookieSerializeOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction1(encode))
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieSerializeOptions]
  }
}

