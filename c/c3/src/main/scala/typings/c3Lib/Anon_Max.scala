package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
  /**
    * Set max width of each bar
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set the width of each bar by ratio
    */
  var ratio: scala.Double
}

object Anon_Max {
  @scala.inline
  def apply(ratio: scala.Double, max: scala.Int | scala.Double = null): Anon_Max = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ratio")(ratio)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Max]
  }
}

