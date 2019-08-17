package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreHistogramEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _HistogramEntry extends js.Object {
  /**
    * <p>The prevalence of the entry.</p>
    */
  var Count: js.UndefOr[Double] = js.undefined
  /**
    * <p>The value of the entry.</p>
    */
  var Value: js.UndefOr[Double] = js.undefined
}

object _HistogramEntry {
  @scala.inline
  def apply(Count: Int | Double = null, Value: Int | Double = null): _HistogramEntry = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_HistogramEntry]
  }
}

