package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorize extends js.Object {
  var Authorize: String
  var Decline: String
  var Fail: String
}

object Authorize {
  @scala.inline
  def apply(Authorize: String, Decline: String, Fail: String): Authorize = {
    val __obj = js.Dynamic.literal(Authorize = Authorize.asInstanceOf[js.Any], Decline = Decline.asInstanceOf[js.Any], Fail = Fail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorize]
  }
}

