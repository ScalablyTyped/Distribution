package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrialsRequest extends js.Object {
  /**
    * A filter that returns only trials created after the specified time.
    */
  var CreatedAfter: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only trials created before the specified time.
    */
  var CreatedBefore: js.UndefOr[Timestamp] = js.native
  /**
    * A filter that returns only trials that are part of the specified experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The maximum number of trials to return in the response. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * If the previous call to ListTrials didn't return the full set of trials, the call returns a token for getting the next set of trials.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The property used to sort results. The default value is CreationTime.
    */
  var SortBy: js.UndefOr[SortTrialsBy] = js.native
  /**
    * The sort order. The default value is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
  /**
    * A filter that returns only trials that are associated with the specified trial component.
    */
  var TrialComponentName: js.UndefOr[ExperimentEntityName] = js.native
}

object ListTrialsRequest {
  @scala.inline
  def apply(
    CreatedAfter: Timestamp = null,
    CreatedBefore: Timestamp = null,
    ExperimentName: ExperimentEntityName = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SortBy: SortTrialsBy = null,
    SortOrder: SortOrder = null,
    TrialComponentName: ExperimentEntityName = null
  ): ListTrialsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreatedAfter != null) __obj.updateDynamic("CreatedAfter")(CreatedAfter.asInstanceOf[js.Any])
    if (CreatedBefore != null) __obj.updateDynamic("CreatedBefore")(CreatedBefore.asInstanceOf[js.Any])
    if (ExperimentName != null) __obj.updateDynamic("ExperimentName")(ExperimentName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (TrialComponentName != null) __obj.updateDynamic("TrialComponentName")(TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrialsRequest]
  }
}

