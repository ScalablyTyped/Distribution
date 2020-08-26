package typings.cookieSession.CookieSessionInterfaces

import typings.cookieSession.cookieSessionStrings.lax
import typings.cookieSession.cookieSessionStrings.none
import typings.cookieSession.cookieSessionStrings.strict
import typings.keygrip.mod.Keygrip
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieSessionOptions extends js.Object {
  /**
    * a string indicating the domain of the cookie (no default).
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * a Date object indicating the cookie's expiration date (expires at the end of session by default).
    */
  var expires: js.UndefOr[Date] = js.native
  /**
    * a boolean indicating whether the cookie is only to be sent over HTTP(S), and not made available to client JavaScript (true by default).
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  /**
    * The list of keys to use to sign & verify cookie values. Set cookies are always signed with keys[0], while the other keys are valid for verification, allowing for key rotation.
    */
  var keys: js.UndefOr[js.Array[String] | Keygrip] = js.native
  /**
    * a number representing the milliseconds from Date.now() for expiry.
    */
  var maxAge: js.UndefOr[Double] = js.native
  /**
    * The name of the cookie to set, defaults to session.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * a boolean indicating whether to overwrite previously set cookies of the same name (true by default). If this is true, all cookies set during the same request with the same name (regardless of path or domain) are filtered out of the Set-Cookie header when setting this cookie.
    */
  var overwrite: js.UndefOr[Boolean] = js.native
  /**
    * a string indicating the path of the cookie (/ by default).
    */
  var path: js.UndefOr[String] = js.native
  /**
    * a boolean or string indicating whether the cookie is a "same site" cookie (false by default). This can be set to 'strict', 'lax', 'none', or true (which maps to 'strict').
    */
  var sameSite: js.UndefOr[strict | lax | none | Boolean] = js.native
  /**
    * A string which will be used as single key if keys is not provided.
    */
  var secret: js.UndefOr[String] = js.native
  /**
    * a boolean indicating whether the cookie is only to be sent over HTTPS (false by default for HTTP, true by default for HTTPS).
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * a boolean indicating whether the cookie is only to be sent over HTTPS (use this if you handle SSL not in your node process).
    */
  var secureProxy: js.UndefOr[Boolean] = js.native
  /**
    * a boolean indicating whether the cookie is to be signed (true by default). If this is true, another cookie of the same name with the .sig suffix appended will also be sent, with a 27-byte url-safe base64 SHA1 value representing the hash of cookie-name=cookie-value against the
    * first Keygrip key. This signature key is used to detect tampering the next time a cookie is received.
    */
  var signed: js.UndefOr[Boolean] = js.native
}

object CookieSessionOptions {
  @scala.inline
  def apply(): CookieSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieSessionOptions]
  }
  @scala.inline
  implicit class CookieSessionOptionsOps[Self <: CookieSessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setExpires(value: Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String] | Keygrip): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSameSite(value: strict | lax | none | Boolean): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSecureProxy(value: Boolean): Self = this.set("secureProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureProxy: Self = this.set("secureProxy", js.undefined)
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
  }
  
}

