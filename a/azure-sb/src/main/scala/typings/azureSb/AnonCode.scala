package typings.azureSb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var Code: String
  var Detail: String
}

object AnonCode {
  @scala.inline
  def apply(Code: String, Detail: String): AnonCode = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCode]
  }
}

