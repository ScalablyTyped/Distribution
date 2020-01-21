package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramEntry extends js.Object {
  /**
    * The prevalence of the entry.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * The value of the entry.
    */
  var Value: js.UndefOr[Double] = js.native
}

object HistogramEntry {
  @scala.inline
  def apply(Count: Int | scala.Double = null, Value: Int | scala.Double = null): HistogramEntry = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramEntry]
  }
}

