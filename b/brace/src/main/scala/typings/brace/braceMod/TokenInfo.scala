package typings.brace.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfo extends js.Object {
  var value: String
}

object TokenInfo {
  @scala.inline
  def apply(value: String): TokenInfo = {
    val __obj = js.Dynamic.literal(value = value)
  
    __obj.asInstanceOf[TokenInfo]
  }
}

