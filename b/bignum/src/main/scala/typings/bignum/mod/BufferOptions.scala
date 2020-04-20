package typings.bignum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferOptions extends js.Object {
  /** Can be either 'big' or 'little'. Also accepts 1 for big and -1 for little. Doesn't matter when size = 1. */
  var endian: String | Double
  /** Number of bytes per word, or 'auto' to flip entire Buffer. */
  var size: Double | String
}

object BufferOptions {
  @scala.inline
  def apply(endian: String | Double, size: Double | String): BufferOptions = {
    val __obj = js.Dynamic.literal(endian = endian.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferOptions]
  }
}

