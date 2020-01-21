package typings.cbor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var max_depth: js.UndefOr[Double] = js.undefined
}

object CommentOptions {
  @scala.inline
  def apply(encoding: String = null, max_depth: Int | Double = null): CommentOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (max_depth != null) __obj.updateDynamic("max_depth")(max_depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentOptions]
  }
}

