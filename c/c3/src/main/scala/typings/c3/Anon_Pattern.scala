package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pattern extends js.Object {
  /**
    * Set custom color pattern.
    */
  var pattern: js.UndefOr[js.Array[String]] = js.undefined
  var threshold: js.UndefOr[js.Any] = js.undefined
}

object Anon_Pattern {
  @scala.inline
  def apply(pattern: js.Array[String] = null, threshold: js.Any = null): Anon_Pattern = {
    val __obj = js.Dynamic.literal()
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold)
    __obj.asInstanceOf[Anon_Pattern]
  }
}

