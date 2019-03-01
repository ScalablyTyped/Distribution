package typings
package bignumLib.bignumMod.BigNumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferOptions extends js.Object {
  /** Can be either 'big' or 'little'. Also accepts 1 for big and -1 for little. Doesn't matter when size = 1. */
  var endian: java.lang.String | scala.Double
  /** Number of bytes per word, or 'auto' to flip entire Buffer. */
  var size: scala.Double | java.lang.String
}

object BufferOptions {
  @scala.inline
  def apply(endian: java.lang.String | scala.Double, size: scala.Double | java.lang.String): BufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endian")(endian.asInstanceOf[js.Any])
    __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferOptions]
  }
}

