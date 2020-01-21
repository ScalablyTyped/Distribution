package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  /**
    * The keys that are included in this group.
    */
  var Keys: js.UndefOr[typings.awsSdk.costexplorerMod.Keys] = js.native
  /**
    * The metrics that are included in this group.
    */
  var Metrics: js.UndefOr[typings.awsSdk.costexplorerMod.Metrics] = js.native
}

object Group {
  @scala.inline
  def apply(Keys: Keys = null, Metrics: Metrics = null): Group = {
    val __obj = js.Dynamic.literal()
    if (Keys != null) __obj.updateDynamic("Keys")(Keys.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

