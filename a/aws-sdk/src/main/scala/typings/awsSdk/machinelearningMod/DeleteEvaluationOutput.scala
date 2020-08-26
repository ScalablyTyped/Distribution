package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEvaluationOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the Evaluation. This value should be identical to the value of the EvaluationId in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.native
}

object DeleteEvaluationOutput {
  @scala.inline
  def apply(): DeleteEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEvaluationOutput]
  }
  @scala.inline
  implicit class DeleteEvaluationOutputOps[Self <: DeleteEvaluationOutput] (val x: Self) extends AnyVal {
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
    def setEvaluationId(value: EntityId): Self = this.set("EvaluationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationId: Self = this.set("EvaluationId", js.undefined)
  }
  
}

