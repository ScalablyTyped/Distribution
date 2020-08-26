package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelScores extends js.Object {
  /**
    * The model version.
    */
  var modelVersion: js.UndefOr[ModelVersion] = js.native
  /**
    * The model's fraud prediction scores.
    */
  var scores: js.UndefOr[ModelPredictionMap] = js.native
}

object ModelScores {
  @scala.inline
  def apply(): ModelScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelScores]
  }
  @scala.inline
  implicit class ModelScoresOps[Self <: ModelScores] (val x: Self) extends AnyVal {
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
    def setModelVersion(value: ModelVersion): Self = this.set("modelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelVersion: Self = this.set("modelVersion", js.undefined)
    @scala.inline
    def setScores(value: ModelPredictionMap): Self = this.set("scores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScores: Self = this.set("scores", js.undefined)
  }
  
}

