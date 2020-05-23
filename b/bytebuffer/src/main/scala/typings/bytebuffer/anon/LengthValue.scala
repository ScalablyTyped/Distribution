package typings.bytebuffer.anon

import typings.long.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LengthValue extends js.Object {
  var length: Double
  var value: Long
}

object LengthValue {
  @scala.inline
  def apply(length: Double, value: Long): LengthValue = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthValue]
  }
}

