package typings.bytebuffer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var length: Double
  var string: String
}

object Length {
  @scala.inline
  def apply(length: Double, string: String): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

