package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTextTranslationJobsRequest extends js.Object {
  /**
    * The parameters that specify which batch translation jobs to retrieve. Filters include job name, job status, and submission time. You can only set one filter at a time.
    */
  var Filter: js.UndefOr[TextTranslationJobFilter] = js.native
  /**
    * The maximum number of results to return in each page. The default value is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.native
}

object ListTextTranslationJobsRequest {
  @scala.inline
  def apply(
    Filter: TextTranslationJobFilter = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListTextTranslationJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTextTranslationJobsRequest]
  }
}

