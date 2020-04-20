package typings.bytebuffer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  var length: Double
  var string: String
}

object AnonLength {
  @scala.inline
  def apply(length: Double, string: String): AnonLength = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLength]
  }
}

