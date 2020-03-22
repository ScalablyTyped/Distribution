package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRatio extends js.Object {
  /**
    * Set max width of each bar
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Set the width of each bar by ratio
    * Defaults to `0.6`.
    */
  var ratio: Double
}

object AnonRatio {
  @scala.inline
  def apply(ratio: Double, max: Int | Double = null): AnonRatio = {
    val __obj = js.Dynamic.literal(ratio = ratio.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRatio]
  }
}

