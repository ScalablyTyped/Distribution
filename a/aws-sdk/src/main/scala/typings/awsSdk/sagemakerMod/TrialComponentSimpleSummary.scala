package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentSimpleSummary extends js.Object {
  var CreatedBy: js.UndefOr[UserContext] = js.native
  /**
    * When the component was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentArn] = js.native
  /**
    * The name of the trial component.
    */
  var TrialComponentName: js.UndefOr[ExperimentEntityName] = js.native
  var TrialComponentSource: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentSource] = js.native
}

object TrialComponentSimpleSummary {
  @scala.inline
  def apply(): TrialComponentSimpleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentSimpleSummary]
  }
  @scala.inline
  implicit class TrialComponentSimpleSummaryOps[Self <: TrialComponentSimpleSummary] (val x: Self) extends AnyVal {
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
    def setCreatedBy(value: UserContext): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setTrialComponentArn(value: TrialComponentArn): Self = this.set("TrialComponentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialComponentArn: Self = this.set("TrialComponentArn", js.undefined)
    @scala.inline
    def setTrialComponentName(value: ExperimentEntityName): Self = this.set("TrialComponentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialComponentName: Self = this.set("TrialComponentName", js.undefined)
    @scala.inline
    def setTrialComponentSource(value: TrialComponentSource): Self = this.set("TrialComponentSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialComponentSource: Self = this.set("TrialComponentSource", js.undefined)
  }
  
}

