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
  def apply(metricName: MetricName = null, recipeList: ArnList = null): AutoMLConfig = {
    val __obj = js.Dynamic.literal()
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (recipeList != null) __obj.updateDynamic("recipeList")(recipeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLConfig]
  }
}

