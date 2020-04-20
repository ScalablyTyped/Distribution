package typings.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorization extends js.Object {
  var authorization: String
}

object AnonAuthorization {
  @scala.inline
  def apply(authorization: String): AnonAuthorization = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorization]
  }
}

