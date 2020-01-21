package typings.azureSb

import typings.azureSb.mod.Azure.ServiceBus.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders extends js.Object {
  var headers: Dictionary[String]
}

object AnonHeaders {
  @scala.inline
  def apply(headers: Dictionary[String]): AnonHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeaders]
  }
}

