package typings.brace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfo extends js.Object {
  var value: String
}

object TokenInfo {
  @scala.inline
  def apply(value: String): TokenInfo = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenInfo]
  }
}

