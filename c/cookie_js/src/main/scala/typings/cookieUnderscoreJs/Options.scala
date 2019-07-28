package typings.cookieUnderscoreJs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var domain: String
  var expires: Double | String | Date
  var path: String
  var secure: Boolean
}

object Options {
  @scala.inline
  def apply(domain: String, expires: Double | String | Date, path: String, secure: Boolean): Options = {
    val __obj = js.Dynamic.literal(domain = domain, expires = expires.asInstanceOf[js.Any], path = path, secure = secure)
  
    __obj.asInstanceOf[Options]
  }
}

