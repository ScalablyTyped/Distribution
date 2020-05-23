package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ratio extends js.Object {
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

object Ratio {
  @scala.inline
  def apply(ratio: Double, max: js.UndefOr[Double] = js.undefined): Ratio = {
    val __obj = js.Dynamic.literal(ratio = ratio.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ratio]
  }
}

