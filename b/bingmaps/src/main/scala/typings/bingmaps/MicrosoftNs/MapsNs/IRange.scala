package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRange extends js.Object {
  /** The maximum value. */
  var max: Double
  /** The minimum value. */
  var min: Double
}

object IRange {
  @scala.inline
  def apply(max: Double, min: Double): IRange = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[IRange]
  }
}

