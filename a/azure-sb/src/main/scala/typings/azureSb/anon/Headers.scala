package typings.azureSb.anon

import typings.azureSb.mod.Azure.ServiceBus.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var headers: Dictionary[String]
}

object Headers {
  @scala.inline
  def apply(headers: Dictionary[String]): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

