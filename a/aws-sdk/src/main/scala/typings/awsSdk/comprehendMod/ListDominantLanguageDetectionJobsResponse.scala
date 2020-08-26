package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDominantLanguageDetectionJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job that is returned.
    */
  var DominantLanguageDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.DominantLanguageDetectionJobPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDominantLanguageDetectionJobsResponse {
  @scala.inline
  def apply(): ListDominantLanguageDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDominantLanguageDetectionJobsResponse]
  }
  @scala.inline
  implicit class ListDominantLanguageDetectionJobsResponseOps[Self <: ListDominantLanguageDetectionJobsResponse] (val x: Self) extends AnyVal {
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
    def setDominantLanguageDetectionJobPropertiesListVarargs(value: DominantLanguageDetectionJobProperties*): Self = this.set("DominantLanguageDetectionJobPropertiesList", js.Array(value :_*))
    @scala.inline
    def setDominantLanguageDetectionJobPropertiesList(value: DominantLanguageDetectionJobPropertiesList): Self = this.set("DominantLanguageDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDominantLanguageDetectionJobPropertiesList: Self = this.set("DominantLanguageDetectionJobPropertiesList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

