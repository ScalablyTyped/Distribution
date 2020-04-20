package typings.csurf.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  def csrfToken(): String
}

object Request {
  @scala.inline
  def apply(csrfToken: () => String): Request = {
    val __obj = js.Dynamic.literal(csrfToken = js.Any.fromFunction0(csrfToken))
    __obj.asInstanceOf[Request]
  }
}

