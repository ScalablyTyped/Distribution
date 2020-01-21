package typings.concatStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcatOpts extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
}

object ConcatOpts {
  @scala.inline
  def apply(encoding: String = null): ConcatOpts = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatOpts]
  }
}

