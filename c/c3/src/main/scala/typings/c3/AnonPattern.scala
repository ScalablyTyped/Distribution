package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPattern extends js.Object {
  /**
    * Set custom color pattern. Order matches the order of the data.
    */
  var pattern: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * **Experimental.**
    */
  var threshold: js.UndefOr[AnonMax] = js.undefined
}

object AnonPattern {
  @scala.inline
  def apply(pattern: js.Array[String] = null, threshold: AnonMax = null): AnonPattern = {
    val __obj = js.Dynamic.literal()
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPattern]
  }
}

