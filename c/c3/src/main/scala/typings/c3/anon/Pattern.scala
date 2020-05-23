package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  /**
    * Set custom color pattern. Order matches the order of the data.
    */
  var pattern: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * **Experimental.**
    */
  var threshold: js.UndefOr[Max] = js.undefined
}

object Pattern {
  @scala.inline
  def apply(pattern: js.Array[String] = null, threshold: Max = null): Pattern = {
    val __obj = js.Dynamic.literal()
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

