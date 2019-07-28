package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
  /**
    * Set max width of each bar
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Set the width of each bar by ratio
    */
  var ratio: Double
}

object Anon_Max {
  @scala.inline
  def apply(ratio: Double, max: Int | Double = null): Anon_Max = {
    val __obj = js.Dynamic.literal(ratio = ratio)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Max]
  }
}

