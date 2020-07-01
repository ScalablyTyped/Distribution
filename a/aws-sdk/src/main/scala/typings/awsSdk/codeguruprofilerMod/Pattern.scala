package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern extends js.Object {
  /**
    *  A list of the different counters used to determine if there is a match. 
    */
  var countersToAggregate: js.UndefOr[Strings] = js.native
  /**
    * The description of the recommendation. This explains a potential inefficiency in a profiled application.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The universally unique identifier (UUID) of this pattern.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name for this pattern.
    */
  var name: js.UndefOr[String] = js.native
  /**
    *  A string that contains the steps recommended to address the potential inefficiency. 
    */
  var resolutionSteps: js.UndefOr[String] = js.native
  /**
    * A list of frame names that were searched during the analysis that generated a recommendation.
    */
  var targetFrames: js.UndefOr[TargetFrames] = js.native
  /**
    *  The percentage of time an application spends in one method that triggers a recommendation. The percentage of time is the same as the percentage of the total gathered sample counts during analysis. 
    */
  var thresholdPercent: js.UndefOr[Percentage] = js.native
}

object Pattern {
  @scala.inline
  def apply(
    countersToAggregate: Strings = null,
    description: String = null,
    id: String = null,
    name: String = null,
    resolutionSteps: String = null,
    targetFrames: TargetFrames = null,
    thresholdPercent: js.UndefOr[Percentage] = js.undefined
  ): Pattern = {
    val __obj = js.Dynamic.literal()
    if (countersToAggregate != null) __obj.updateDynamic("countersToAggregate")(countersToAggregate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resolutionSteps != null) __obj.updateDynamic("resolutionSteps")(resolutionSteps.asInstanceOf[js.Any])
    if (targetFrames != null) __obj.updateDynamic("targetFrames")(targetFrames.asInstanceOf[js.Any])
    if (!js.isUndefined(thresholdPercent)) __obj.updateDynamic("thresholdPercent")(thresholdPercent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

