package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLConfig extends js.Object {
  /**
    * The metric to optimize.
    */
  var metricName: js.UndefOr[MetricName] = js.native
  /**
    * The list of candidate recipes.
    */
  var recipeList: js.UndefOr[ArnList] = js.native
}

object AutoMLConfig {
  @scala.inline
  def apply(): AutoMLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLConfig]
  }
  @scala.inline
  implicit class AutoMLConfigOps[Self <: AutoMLConfig] (val x: Self) extends AnyVal {
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
    def setMetricName(value: MetricName): Self = this.set("metricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
    @scala.inline
    def setRecipeListVarargs(value: Arn*): Self = this.set("recipeList", js.Array(value :_*))
    @scala.inline
    def setRecipeList(value: ArnList): Self = this.set("recipeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipeList: Self = this.set("recipeList", js.undefined)
  }
  
}

