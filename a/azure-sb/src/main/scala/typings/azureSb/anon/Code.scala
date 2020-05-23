package typings.azureSb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var Code: String
  var Detail: String
}

object Code {
  @scala.inline
  def apply(Code: String, Detail: String): Code = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

