package typings.carbone.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var code: String
  var name: String
  var regex: RegExp
}

object Variable {
  @scala.inline
  def apply(code: String, name: String, regex: RegExp): Variable = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}

