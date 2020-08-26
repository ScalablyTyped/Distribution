package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesDetectionV2JobsResponse extends js.Object {
  /**
    * A list containing the properties of each job returned.
    */
  var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListEntitiesDetectionV2JobsResponse {
  @scala.inline
  def apply(): ListEntitiesDetectionV2JobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesDetectionV2JobsResponse]
  }
  @scala.inline
  implicit class ListEntitiesDetectionV2JobsResponseOps[Self <: ListEntitiesDetectionV2JobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComprehendMedicalAsyncJobPropertiesListVarargs(value: ComprehendMedicalAsyncJobProperties*): Self = this.set("ComprehendMedicalAsyncJobPropertiesList", js.Array(value :_*))
    @scala.inline
    def setComprehendMedicalAsyncJobPropertiesList(value: ComprehendMedicalAsyncJobPropertiesList): Self = this.set("ComprehendMedicalAsyncJobPropertiesList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComprehendMedicalAsyncJobPropertiesList: Self = this.set("ComprehendMedicalAsyncJobPropertiesList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

