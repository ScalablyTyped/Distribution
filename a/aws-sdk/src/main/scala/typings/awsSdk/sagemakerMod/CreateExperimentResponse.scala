package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExperimentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentArn] = js.native
}

object CreateExperimentResponse {
  @scala.inline
  def apply(): CreateExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateExperimentResponse]
  }
  @scala.inline
  implicit class CreateExperimentResponseOps[Self <: CreateExperimentResponse] (val x: Self) extends AnyVal {
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
    def setExperimentArn(value: ExperimentArn): Self = this.set("ExperimentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentArn: Self = this.set("ExperimentArn", js.undefined)
  }
  
}

