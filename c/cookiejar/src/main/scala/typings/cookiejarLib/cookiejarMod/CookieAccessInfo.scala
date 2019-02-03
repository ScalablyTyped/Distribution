package typings
package cookiejarLib.cookiejarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cookiejar", "CookieAccessInfo")
@js.native
class CookieAccessInfo protected () extends js.Object {
  /**
    * Class to determine matching qualities of a cookie
    * @param domain string domain to match
    * @param path string path to match
    * @param secure boolean access is secure (ssl generally)
    * @param script boolean access is from a script
    */
  def this(domain: java.lang.String) = this()
  def this(domain: java.lang.String, path: java.lang.String) = this()
  def this(domain: java.lang.String, path: java.lang.String, secure: scala.Boolean) = this()
  def this(domain: java.lang.String, path: java.lang.String, secure: scala.Boolean, script: scala.Boolean) = this()
  var domain: java.lang.String = js.native
   // domain to match
  var path: java.lang.String = js.native
   // access is secure (ssl generally)
  var script: scala.Boolean = js.native
   // path to match
  var secure: scala.Boolean = js.native
}

/* static members */
@JSImport("cookiejar", "CookieAccessInfo")
@js.native
object CookieAccessInfo extends js.Object {
  var All: cookiejarLib.cookiejarMod.CookieAccessInfo = js.native
}

