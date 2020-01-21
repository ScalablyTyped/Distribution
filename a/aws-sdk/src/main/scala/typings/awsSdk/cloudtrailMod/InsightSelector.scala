package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightSelector extends js.Object {
  /**
    * The type of insights to log on a trail. In this release, only ApiCallRateInsight is supported as an insight type.
    */
  var InsightType: js.UndefOr[typings.awsSdk.cloudtrailMod.InsightType] = js.native
}

object InsightSelector {
  @scala.inline
  def apply(InsightType: InsightType = null): InsightSelector = {
    val __obj = js.Dynamic.literal()
    if (InsightType != null) __obj.updateDynamic("InsightType")(InsightType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightSelector]
  }
}

