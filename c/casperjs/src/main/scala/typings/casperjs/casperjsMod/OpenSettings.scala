package typings.casperjs.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenSettings extends js.Object {
  var data: js.Any
  var headers: js.Any
  var method: String
}

object OpenSettings {
  @scala.inline
  def apply(data: js.Any, headers: js.Any, method: String): OpenSettings = {
    val __obj = js.Dynamic.literal(data = data, headers = headers, method = method)
  
    __obj.asInstanceOf[OpenSettings]
  }
}

