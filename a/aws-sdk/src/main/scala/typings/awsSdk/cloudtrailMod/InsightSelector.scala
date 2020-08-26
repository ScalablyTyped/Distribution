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
  def apply(): InsightSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightSelector]
  }
  @scala.inline
  implicit class InsightSelectorOps[Self <: InsightSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInsightType(value: InsightType): Self = this.set("InsightType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsightType: Self = this.set("InsightType", js.undefined)
  }
  
}

