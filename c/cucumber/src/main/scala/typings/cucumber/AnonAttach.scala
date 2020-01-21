package typings.cucumber

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttach extends js.Object {
  var attach: js.Function
  var parameters: StringDictionary[js.Any]
}

object AnonAttach {
  @scala.inline
  def apply(attach: js.Function, parameters: StringDictionary[js.Any]): AnonAttach = {
    val __obj = js.Dynamic.literal(attach = attach.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttach]
  }
}

