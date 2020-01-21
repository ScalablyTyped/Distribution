package typings.cbor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodeOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
}

object DecodeOptions {
  @scala.inline
  def apply(encoding: String = null): DecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeOptions]
  }
}

