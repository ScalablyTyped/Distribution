package typings.childDashProcessDashPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingString extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
}

object Anon_EncodingString {
  @scala.inline
  def apply(encoding: String = null): Anon_EncodingString = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingString]
  }
}

