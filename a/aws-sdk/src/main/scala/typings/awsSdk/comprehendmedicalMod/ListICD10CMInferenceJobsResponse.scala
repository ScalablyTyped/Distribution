package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListICD10CMInferenceJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job that is returned.
    */
  var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListICD10CMInferenceJobsResponse {
  @scala.inline
  def apply(
    ComprehendMedicalAsyncJobPropertiesList: ComprehendMedicalAsyncJobPropertiesList = null,
    NextToken: String = null
  ): ListICD10CMInferenceJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (ComprehendMedicalAsyncJobPropertiesList != null) __obj.updateDynamic("ComprehendMedicalAsyncJobPropertiesList")(ComprehendMedicalAsyncJobPropertiesList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListICD10CMInferenceJobsResponse]
  }
}

