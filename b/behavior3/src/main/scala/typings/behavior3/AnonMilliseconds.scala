package typings.behavior3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMilliseconds extends js.Object {
  var milliseconds: js.UndefOr[Double] = js.undefined
}

object AnonMilliseconds {
  @scala.inline
  def apply(milliseconds: Int | Double = null): AnonMilliseconds = {
    val __obj = js.Dynamic.literal()
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMilliseconds]
  }
}

