package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyRecommendationDetail extends js.Object {
  /**
    * Identifies whether this instance type is the Amazon Web Services default recommendation.
    */
  var TargetInstances: js.UndefOr[TargetInstancesList] = js.native
}

object ModifyRecommendationDetail {
  @scala.inline
  def apply(): ModifyRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyRecommendationDetail]
  }
  @scala.inline
  implicit class ModifyRecommendationDetailOps[Self <: ModifyRecommendationDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetInstancesVarargs(value: TargetInstance*): Self = this.set("TargetInstances", js.Array(value :_*))
    @scala.inline
    def setTargetInstances(value: TargetInstancesList): Self = this.set("TargetInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetInstances: Self = this.set("TargetInstances", js.undefined)
  }
  
}

