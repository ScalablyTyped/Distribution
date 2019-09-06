package typings.cloudDashConfigDashClient.cloudDashConfigDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  var pass: String
  var user: String
}

object Auth {
  @scala.inline
  def apply(pass: String, user: String): Auth = {
    val __obj = js.Dynamic.literal(pass = pass, user = user)
  
    __obj.asInstanceOf[Auth]
  }
}

