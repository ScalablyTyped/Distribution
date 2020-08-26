package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentConfig extends js.Object {
  /**
    * The name of an existing experiment to associate the trial component with.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The display name for the trial component. If this key isn't specified, the display name is the trial component name.
    */
  var TrialComponentDisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The name of an existing trial to associate the trial component with. If not specified, a new trial is created.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
}

object ExperimentConfig {
  @scala.inline
  def apply(): ExperimentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentConfig]
  }
  @scala.inline
  implicit class ExperimentConfigOps[Self <: ExperimentConfig] (val x: Self) extends AnyVal {
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
    def setExperimentName(value: ExperimentEntityName): Self = this.set("ExperimentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentName: Self = this.set("ExperimentName", js.undefined)
    @scala.inline
    def setTrialComponentDisplayName(value: ExperimentEntityName): Self = this.set("TrialComponentDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialComponentDisplayName: Self = this.set("TrialComponentDisplayName", js.undefined)
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = this.set("TrialName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrialName: Self = this.set("TrialName", js.undefined)
  }
  
}

