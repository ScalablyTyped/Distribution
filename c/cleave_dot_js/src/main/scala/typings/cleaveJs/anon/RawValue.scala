package typings.cleaveJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawValue extends js.Object {
  var rawValue: String
}

object RawValue {
  @scala.inline
  def apply(rawValue: String): RawValue = {
    val __obj = js.Dynamic.literal(rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawValue]
  }
}

