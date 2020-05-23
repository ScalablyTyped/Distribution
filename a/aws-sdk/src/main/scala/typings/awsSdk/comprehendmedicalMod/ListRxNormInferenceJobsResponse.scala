package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRxNormInferenceJobsResponse extends js.Object {
  /**
    * The maximum number of results to return in each page. The default is 100.
    */
  var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListRxNormInferenceJobsResponse {
  @scala.inline
  def apply(
    ComprehendMedicalAsyncJobPropertiesList: ComprehendMedicalAsyncJobPropertiesList = null,
    NextToken: String = null
  ): ListRxNormInferenceJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (ComprehendMedicalAsyncJobPropertiesList != null) __obj.updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(ComprehendMedicalAsyncJobPropertiesList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRxNormInferenceJobsResponse]
  }
}

