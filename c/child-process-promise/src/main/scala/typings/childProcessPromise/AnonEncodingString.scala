package typings.childProcessPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingString extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
}

object AnonEncodingString {
  @scala.inline
  def apply(encoding: String = null): AnonEncodingString = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingString]
  }
}

