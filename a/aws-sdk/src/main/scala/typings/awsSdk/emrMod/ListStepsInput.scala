package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStepsInput extends js.Object {
  /**
    * The identifier of the cluster for which to list the steps.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
  /**
    * The filter to limit the step list based on the identifier of the steps. You can specify a maximum of ten Step IDs. The character constraint applies to the overall length of the array.
    */
  var StepIds: js.UndefOr[XmlStringList] = js.native
  /**
    * The filter to limit the step list based on certain states.
    */
  var StepStates: js.UndefOr[StepStateList] = js.native
}

object ListStepsInput {
  @scala.inline
  def apply(
    ClusterId: ClusterId,
    Marker: Marker = null,
    StepIds: XmlStringList = null,
    StepStates: StepStateList = null
  ): ListStepsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (StepIds != null) __obj.updateDynamic("StepIds")(StepIds.asInstanceOf[js.Any])
    if (StepStates != null) __obj.updateDynamic("StepStates")(StepStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStepsInput]
  }
}

