package typings.childProcessPromise

import typings.childProcessPromise.childProcessPromiseStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var encoding: buffer | Null
}

object AnonBuffer {
  @scala.inline
  def apply(encoding: buffer = null): AnonBuffer = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuffer]
  }
}

