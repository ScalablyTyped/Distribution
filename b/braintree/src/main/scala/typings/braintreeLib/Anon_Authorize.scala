package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authorize extends js.Object {
  var Authorize: java.lang.String
  var Decline: java.lang.String
  var Fail: java.lang.String
}

object Anon_Authorize {
  @scala.inline
  def apply(Authorize: java.lang.String, Decline: java.lang.String, Fail: java.lang.String): Anon_Authorize = {
    val __obj = js.Dynamic.literal(Authorize = Authorize, Decline = Decline, Fail = Fail)
  
    __obj.asInstanceOf[Anon_Authorize]
  }
}

