package typings.cleaveJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRawValue extends js.Object {
  var rawValue: String
}

object AnonRawValue {
  @scala.inline
  def apply(rawValue: String): AnonRawValue = {
    val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRawValue]
  }
}

