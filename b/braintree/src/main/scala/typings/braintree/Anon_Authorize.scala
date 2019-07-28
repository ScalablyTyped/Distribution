package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authorize extends js.Object {
  var Authorize: String
  var Decline: String
  var Fail: String
}

object Anon_Authorize {
  @scala.inline
  def apply(Authorize: String, Decline: String, Fail: String): Anon_Authorize = {
    val __obj = js.Dynamic.literal(Authorize = Authorize, Decline = Decline, Fail = Fail)
  
    __obj.asInstanceOf[Anon_Authorize]
  }
}

