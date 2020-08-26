package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationMetrics extends js.Object {
  /**
    * The evaluation metrics for the find matches algorithm.
    */
  var FindMatchesMetrics: js.UndefOr[typings.awsSdk.glueMod.FindMatchesMetrics] = js.native
  /**
    * The type of machine learning transform.
    */
  var TransformType: typings.awsSdk.glueMod.TransformType = js.native
}

object EvaluationMetrics {
  @scala.inline
  def apply(TransformType: TransformType): EvaluationMetrics = {
    val __obj = js.Dynamic.literal(TransformType = TransformType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationMetrics]
  }
  @scala.inline
  implicit class EvaluationMetricsOps[Self <: EvaluationMetrics] (val x: Self) extends AnyVal {
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
    def setTransformType(value: TransformType): Self = this.set("TransformType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindMatchesMetrics(value: FindMatchesMetrics): Self = this.set("FindMatchesMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindMatchesMetrics: Self = this.set("FindMatchesMetrics", js.undefined)
  }
  
}

