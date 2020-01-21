package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorize extends js.Object {
  var Authorize: String
  var Decline: String
  var Fail: String
}

object AnonAuthorize {
  @scala.inline
  def apply(Authorize: String, Decline: String, Fail: String): AnonAuthorize = {
    val __obj = js.Dynamic.literal(Authorize = Authorize.asInstanceOf[js.Any], Decline = Decline.asInstanceOf[js.Any], Fail = Fail.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuthorize]
  }
}

