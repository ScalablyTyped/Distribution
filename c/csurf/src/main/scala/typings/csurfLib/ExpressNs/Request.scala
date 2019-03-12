package typings
package csurfLib.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  def csrfToken(): java.lang.String
}

object Request {
  @scala.inline
  def apply(csrfToken: () => java.lang.String): Request = {
    val __obj = js.Dynamic.literal(csrfToken = js.Any.fromFunction0(csrfToken))
  
    __obj.asInstanceOf[Request]
  }
}

