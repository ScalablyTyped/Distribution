package typings
package cookiesLib.cookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookies extends js.Object {
  var request: nodeLib.httpMod.IncomingMessage = js.native
  var response: nodeLib.httpMod.ServerResponse = js.native
  var secure: scala.Boolean = js.native
  /**
       * This extracts the cookie with the given name from the
       * Cookie header in the request. If such a cookie exists,
       * its value is returned. Otherwise, nothing is returned.
       */
  def get(name: java.lang.String): java.lang.String = js.native
  /**
       * This extracts the cookie with the given name from the
       * Cookie header in the request. If such a cookie exists,
       * its value is returned. Otherwise, nothing is returned.
       */
  def get(name: java.lang.String, opts: cookiesLib.cookiesMod.CookiesNs.GetOption): java.lang.String = js.native
  /**
       * This sets the given cookie in the response and returns
       * the current context to allow chaining.If the value is omitted,
       * an outbound header with an expired date is used to delete the cookie.
       */
  def set(name: java.lang.String): this.type = js.native
  /**
       * This sets the given cookie in the response and returns
       * the current context to allow chaining.If the value is omitted,
       * an outbound header with an expired date is used to delete the cookie.
       */
  def set(name: java.lang.String, value: java.lang.String): this.type = js.native
  /**
       * This sets the given cookie in the response and returns
       * the current context to allow chaining.If the value is omitted,
       * an outbound header with an expired date is used to delete the cookie.
       */
  def set(name: java.lang.String, value: java.lang.String, opts: cookiesLib.cookiesMod.CookiesNs.SetOption): this.type = js.native
}

