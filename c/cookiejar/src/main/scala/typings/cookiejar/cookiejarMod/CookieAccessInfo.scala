package typings.cookiejar.cookiejarMod

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
  def this(domain: String) = this()
  def this(domain: String, path: String) = this()
  def this(domain: String, path: String, secure: Boolean) = this()
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
@JSImport("cookiejar", "CookieAccessInfo")
@js.native
object CookieAccessInfo extends js.Object {
  var All: CookieAccessInfo = js.native
}

