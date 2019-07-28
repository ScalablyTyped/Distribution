package typings.basicDashAuth.basicDashAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicAuthResult extends js.Object {
  var name: String
  var pass: String
}

object BasicAuthResult {
  @scala.inline
  def apply(name: String, pass: String): BasicAuthResult = {
    val __obj = js.Dynamic.literal(name = name, pass = pass)
  
    __obj.asInstanceOf[BasicAuthResult]
  }
}

