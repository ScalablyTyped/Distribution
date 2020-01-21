package typings.axiosCurlirize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var command: String
}

object Result {
  @scala.inline
  def apply(command: String): Result = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

